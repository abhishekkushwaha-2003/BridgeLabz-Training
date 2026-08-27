package com.fundoo.notes.dto.request;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ReminderRequest {

	@NotNull(message = "Reminder time is required")
	private LocalDateTime reminderAt;
}