package com.fundoo.notes.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fundoo.notes.client.UserClient;
import com.fundoo.notes.dto.client.UserResponseDTO;
import com.fundoo.notes.dto.request.NoteRequest;
import com.fundoo.notes.dto.response.NoteResponseDTO;
import com.fundoo.notes.entity.Note;
import com.fundoo.notes.entity.Note.NoteState;
import com.fundoo.notes.entity.Tag;
import com.fundoo.notes.mapper.NoteMapper;
import com.fundoo.notes.messaging.ReminderProducer;
import com.fundoo.notes.repository.NoteRepository;
import com.fundoo.notes.repository.TagRepository;
import com.fundoo.notes.service.NoteService;
import com.fundoo.notes.specification.NoteSpecifications;

@Service
public class NoteServiceImpl implements NoteService {

	private final NoteRepository noteRepository;
	private final TagRepository tagRepository;
	private final NoteMapper noteMapper;
	private final ReminderProducer reminderProducer;
	private final UserClient userClient;

	public NoteServiceImpl(NoteRepository noteRepository, TagRepository tagRepository, NoteMapper noteMapper,
			ReminderProducer reminderProducer, UserClient userClient) {

		this.noteRepository = noteRepository;
		this.tagRepository = tagRepository;
		this.noteMapper = noteMapper;
		this.reminderProducer = reminderProducer;
		this.userClient = userClient;
	}

	@Override
	public NoteResponseDTO createNote(int userId, NoteRequest request) {

		Note note = new Note();
		note.setTitle(request.getTitle());
		note.setContent(request.getContent());
		note.setCreatedAt(LocalDateTime.now());
		note.setState(NoteState.ACTIVE);
		note.setPinned(false);
		note.setOwnerId(userId);

		return noteMapper.toResponseDTO(noteRepository.save(note));
	}

	@Override
	public NoteResponseDTO updateNote(int noteId, int userId, NoteRequest request) {

		Note note = getOwnedNote(noteId, userId);

		note.setTitle(request.getTitle());
		note.setContent(request.getContent());

		return noteMapper.toResponseDTO(noteRepository.save(note));
	}

	@Override
	public List<NoteResponseDTO> getNotes(int userId, String state, Boolean pinned, String tag) {

		List<Note> notes;

		if (tag != null && !tag.isBlank()) {
			notes = noteRepository.findByOwnerIdAndTagsName(userId, tag);
		} else if (Boolean.TRUE.equals(pinned)) {
			notes = noteRepository.findByOwnerIdAndPinnedTrueAndStateNot(userId, NoteState.TRASHED);
		} else if (state != null && !state.isBlank()) {
			notes = noteRepository.findByOwnerIdAndState(userId, NoteState.valueOf(state.toUpperCase()));
		} else {
			notes = noteRepository.findByOwnerIdAndState(userId, NoteState.ACTIVE);
		}

		return notes.stream().map(noteMapper::toResponseDTO).toList();
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
			throw new IllegalArgumentException("Trashed note cannot be pinned");
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

		Tag tag = tagRepository.findByNameAndOwnerId(tagName, userId).orElseGet(() -> {
			Tag newTag = new Tag();
			newTag.setName(tagName);
			newTag.setOwnerId(userId);
			return tagRepository.save(newTag);
		});

		note.getTags().add(tag);

		return noteMapper.toResponseDTO(noteRepository.save(note));
	}

	@Override
	public List<NoteResponseDTO> searchNotes(int userId, String title, NoteState state, String tag) {

		return noteRepository.findAll(NoteSpecifications.search(userId, title, state, tag)).stream()
				.map(noteMapper::toResponseDTO).toList();
	}

	@Override
	public NoteResponseDTO setReminder(int noteId, int userId, LocalDateTime reminderAt) {

		Note note = getOwnedNote(noteId, userId);

		if (reminderAt.isBefore(LocalDateTime.now())) {
			throw new IllegalArgumentException("Reminder time must be in the future");
		}

		note.setReminderAt(reminderAt);

		Note savedNote = noteRepository.save(note);

		UserResponseDTO user = userClient.getUserById(userId);

		reminderProducer.sendReminder(userId, savedNote.getNoteId(), savedNote.getTitle(), user.getEmail());

		return noteMapper.toResponseDTO(savedNote);
	}

	private Note getOwnedNote(int noteId, int userId) {

		return noteRepository.findByNoteIdAndOwnerId(noteId, userId)
				.orElseThrow(() -> new IllegalArgumentException("Note not found"));
	}
}