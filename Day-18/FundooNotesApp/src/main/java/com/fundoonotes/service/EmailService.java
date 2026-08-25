package com.fundoonotes.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

	private final JavaMailSender mailSender;

	public EmailService(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}

	public void sendPasswordResetEmail(String to, String resetToken) {
		SimpleMailMessage message = new SimpleMailMessage();

		message.setTo(to);
		message.setSubject("Fundoo Notes Password Reset");
		message.setText("Use this token to reset your password: " + resetToken);

		mailSender.send(message);
	}

	public void sendWelcomeEmail(String to, String name) {
		SimpleMailMessage message = new SimpleMailMessage();

		message.setTo(to);
		message.setSubject("Welcome to Fundoo Notes");
		message.setText("Hello " + name + ", welcome to Fundoo Notes!");

		mailSender.send(message);
	}
}