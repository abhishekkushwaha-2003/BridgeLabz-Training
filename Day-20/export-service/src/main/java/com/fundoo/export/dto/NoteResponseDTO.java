package com.fundoo.export.dto;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Data;

@Data
public class NoteResponseDTO {

	private int noteId;
	private String title;
	private String content;
	private LocalDateTime createdAt;
	private LocalDateTime reminderAt;
	private String state;
	private boolean pinned;
	private List<String> tags;
}