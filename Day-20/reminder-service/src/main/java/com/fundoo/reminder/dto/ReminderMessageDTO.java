package com.fundoo.reminder.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReminderMessageDTO {

	private int userId;
	private int noteId;
	private String title;
	private String email;
}