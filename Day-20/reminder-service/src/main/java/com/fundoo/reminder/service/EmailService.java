package com.fundoo.reminder.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

	private final JavaMailSender mailSender;

	public EmailService(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}

	public void sendReminderEmail(String to, String title) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(to);
		message.setSubject("Fundoo Notes Reminder");
		message.setText("Reminder for your note: " + title);

		mailSender.send(message);
	}

	public void sendPasswordResetEmail(String to, String token) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(to);
		message.setSubject("Fundoo Password Reset");
		message.setText("Use this token to reset your password: " + token);

		mailSender.send(message);
	}
}