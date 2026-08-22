package com.fundoonotes.batch;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.fundoonotes.dto.NoteImportRow;
import com.fundoonotes.entity.Note;
import com.fundoonotes.entity.User;
import com.fundoonotes.repository.UserRepository;

@Component
public class NoteImportProcessor implements ItemProcessor<NoteImportRow, Note> {

	private final UserRepository userRepository;

	public NoteImportProcessor(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public Note process(NoteImportRow row) throws Exception {

		if (row.getTitle() == null || row.getTitle().isBlank()) {
			return null; // skip invalid row
		}

		User owner = userRepository.findById(row.getUserId()).orElse(null);

		if (owner == null) {
			return null; // skip if user not found
		}

		Note note = new Note();
		note.setTitle(row.getTitle());
		note.setContent(row.getContent());
		note.setOwner(owner);

		return note;
	}
}