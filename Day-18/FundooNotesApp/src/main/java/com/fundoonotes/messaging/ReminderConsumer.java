package com.fundoonotes.messaging;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.fundoonotes.service.EmailService;

@Component
public class ReminderConsumer {

	private final EmailService emailService;

	public ReminderConsumer(EmailService emailService) {
		this.emailService = emailService;
	}

	@JmsListener(destination = "password-reset-queue")
	public void handlePasswordResetMessage(String message) {

		String[] parts = message.split("\\|");

		String email = parts[0];
		String resetToken = parts[1];

		try {
			emailService.sendPasswordResetEmail(email, resetToken);
			System.out.println("Password reset email sent to: " + email);
		} catch (Exception e) {
			System.out.println("Email sending failed: " + e.getMessage());
		}
	}

	@JmsListener(destination = "note-reminder-queue")
	public void handleNoteReminderMessage(String message) {

		String[] parts = message.split("\\|");

		String userId = parts[0];
		String noteId = parts[1];
		String title = parts[2];

		System.out.println("REMINDER: User " + userId + " has reminder for note " + noteId + " - " + title);
	}
}