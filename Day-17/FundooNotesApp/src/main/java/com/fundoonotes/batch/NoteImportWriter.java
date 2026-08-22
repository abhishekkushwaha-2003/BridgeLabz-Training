package com.fundoonotes.batch;

import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import com.fundoonotes.entity.Note;
import com.fundoonotes.repository.NoteRepository;

@Component
public class NoteImportWriter implements ItemWriter<Note> {

	private final NoteRepository noteRepository;

	public NoteImportWriter(NoteRepository noteRepository) {
		this.noteRepository = noteRepository;
	}

	@Override
	public void write(Chunk<? extends Note> chunk) throws Exception {
		noteRepository.saveAll(chunk.getItems());
	}
}