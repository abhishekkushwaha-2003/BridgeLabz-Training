package com.fundoonotes.service.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.fundoonotes.dto.request.NoteRequest;
import com.fundoonotes.dto.response.NoteResponseDTO;
import com.fundoonotes.entity.Note;
import com.fundoonotes.entity.Note.NoteState;
import com.fundoonotes.entity.Tag;
import com.fundoonotes.entity.User;
import com.fundoonotes.mapper.NoteMapper;
import com.fundoonotes.messaging.ReminderProducer;
import com.fundoonotes.repository.NoteRepository;
import com.fundoonotes.repository.TagRepository;
import com.fundoonotes.repository.UserRepository;
import com.fundoonotes.service.NoteService;
import com.fundoonotes.specification.NoteSpecifications;

@Service
public class NoteServiceImpl implements NoteService {

	private final NoteRepository noteRepository;
	private final UserRepository userRepository;
	private final TagRepository tagRepository;
	private final NoteMapper noteMapper;
	private final ReminderProducer reminderProducer;

	public NoteServiceImpl(NoteRepository noteRepository, UserRepository userRepository, TagRepository tagRepository,
			NoteMapper noteMapper, ReminderProducer reminderProducer) {
		this.noteRepository = noteRepository;
		this.userRepository = userRepository;
		this.tagRepository = tagRepository;
		this.noteMapper = noteMapper;
		this.reminderProducer = reminderProducer;
	}

	@Override
	public NoteResponseDTO createNote(int userId, NoteRequest request) {
		User owner = getUser(userId);

		Note note = new Note();
		note.setTitle(request.getTitle());
		note.setContent(request.getContent());
		note.setOwner(owner);

		return noteMapper.toResponseDTO(noteRepository.save(note));
	}

	@Override
	public List<NoteResponseDTO> getNotes(int userId, String state, Boolean pinned, String tag) {
		User owner = getUser(userId);
		List<Note> notes;

		if (tag != null && !tag.isBlank()) {
			notes = noteRepository.findByOwnerAndTagsName(owner, tag);
		} else if (state != null && !state.isBlank()) {
			notes = noteRepository.findByOwnerAndState(owner, NoteState.valueOf(state.toUpperCase()));
		} else if (Boolean.TRUE.equals(pinned)) {
			notes = noteRepository.findByOwnerAndPinnedTrueAndStateNot(owner, NoteState.TRASHED);
		} else {
			notes = noteRepository.findByOwnerAndState(owner, NoteState.ACTIVE);
		}

		return mapList(notes);
	}

	@Override
	public boolean deleteNote(int noteId, int userId) {
		Note note = getOwnedNote(noteId, userId);
		noteRepository.delete(note);
		return true;
	}

	@Override
	public NoteResponseDTO archiveNote(int noteId, int userId) {
		Note note = getOwnedNote(noteId, userId);
		note.setState(NoteState.ARCHIVED);
		note.setPinned(false);
		return noteMapper.toResponseDTO(noteRepository.save(note));
	}

	@Override
	public NoteResponseDTO trashNote(int noteId, int userId) {
		Note note = getOwnedNote(noteId, userId);
		note.setState(NoteState.TRASHED);
		note.setPinned(false);
		return noteMapper.toResponseDTO(noteRepository.save(note));
	}

	@Override
	public NoteResponseDTO restoreNote(int noteId, int userId) {
		Note note = getOwnedNote(noteId, userId);
		note.setState(NoteState.ACTIVE);
		return noteMapper.toResponseDTO(noteRepository.save(note));
	}

	@Override
	public NoteResponseDTO pinNote(int noteId, int userId) {
		Note note = getOwnedNote(noteId, userId);

		if (note.getState() == NoteState.TRASHED) {
			throw new IllegalStateException("Cannot pin a note that is in Trash");
		}

		note.setPinned(true);
		return noteMapper.toResponseDTO(noteRepository.save(note));
	}

	@Override
	public NoteResponseDTO unpinNote(int noteId, int userId) {
		Note note = getOwnedNote(noteId, userId);
		note.setPinned(false);
		return noteMapper.toResponseDTO(noteRepository.save(note));
	}

	@Override
	public NoteResponseDTO addTagToNote(int noteId, int userId, String tagName) {
		Note note = getOwnedNote(noteId, userId);

		Tag tag = tagRepository.findByName(tagName).orElseGet(() -> tagRepository.save(new Tag(tagName)));

		note.getTags().add(tag);

		return noteMapper.toResponseDTO(noteRepository.save(note));
	}

	@Override
	public List<NoteResponseDTO> searchNotes(int userId, String title, NoteState state, String tag) {
		User owner = getUser(userId);
		Specification<Note> spec = NoteSpecifications.search(owner, title, state, tag);
		return mapList(noteRepository.findAll(spec));
	}

	private User getUser(int userId) {
		return userRepository.findById(userId).orElseThrow(() -> new IllegalArgumentException("User not found"));
	}

	private Note getOwnedNote(int noteId, int userId) {
		User owner = getUser(userId);

		return noteRepository.findByNoteIdAndOwner(noteId, owner)
				.orElseThrow(() -> new IllegalArgumentException("Note not found"));
	}

	private List<NoteResponseDTO> mapList(List<Note> notes) {
		return notes.stream().map(noteMapper::toResponseDTO).collect(Collectors.toList());
	}

	@Override
	public NoteResponseDTO setReminder(int noteId, int userId, LocalDateTime reminderAt) {

	    Note note = getOwnedNote(noteId, userId);

	    if (reminderAt.isBefore(LocalDateTime.now())) {
	        throw new IllegalArgumentException("Reminder time must be in the future");
	    }

	    note.setReminderAt(reminderAt);

	    Note savedNote = noteRepository.save(note);

	    reminderProducer.sendNoteReminderMessage(
	            userId,
	            savedNote.getNoteId(),
	            savedNote.getTitle()
	    );

	    return noteMapper.toResponseDTO(savedNote);
	}
}