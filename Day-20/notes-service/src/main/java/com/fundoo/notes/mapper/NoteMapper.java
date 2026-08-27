package com.fundoo.notes.mapper;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.fundoo.notes.dto.response.NoteResponseDTO;
import com.fundoo.notes.dto.response.TagResponseDTO;
import com.fundoo.notes.entity.Note;
import com.fundoo.notes.entity.Tag;

@Component
public class NoteMapper {

	public NoteResponseDTO toResponseDTO(Note note) {

		Set<TagResponseDTO> tagDTOs = note.getTags().stream().map(this::toTagResponseDTO).collect(Collectors.toSet());

		return new NoteResponseDTO(note.getNoteId(), note.getTitle(), note.getContent(), note.getCreatedAt(),
				note.getReminderAt(), note.getState(), note.isPinned(), tagDTOs);
	}

	public TagResponseDTO toTagResponseDTO(Tag tag) {
		return new TagResponseDTO(tag.getTagId(), tag.getName());
	}
}