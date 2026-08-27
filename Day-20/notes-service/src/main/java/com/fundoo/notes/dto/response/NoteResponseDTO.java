package com.fundoo.notes.dto.response;

import java.time.LocalDateTime;
import java.util.Set;

import com.fundoo.notes.entity.Note.NoteState;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class NoteResponseDTO {

	private int noteId;
	private String title;
	private String content;
	private LocalDateTime createdAt;
	private LocalDateTime reminderAt;
	private NoteState state;
	private boolean pinned;
	private Set<TagResponseDTO> tags;
}