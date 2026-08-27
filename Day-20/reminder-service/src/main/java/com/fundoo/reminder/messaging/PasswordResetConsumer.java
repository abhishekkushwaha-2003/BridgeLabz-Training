package com.fundoo.reminder.messaging;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.fundoo.reminder.config.RabbitMQConfig;
import com.fundoo.reminder.service.EmailService;

@Component
public class PasswordResetConsumer {

	private final EmailService emailService;

	public PasswordResetConsumer(EmailService emailService) {
		this.emailService = emailService;
	}

	@RabbitListener(queues = RabbitMQConfig.PASSWORD_RESET_QUEUE)
	public void consumePasswordReset(String message) {

		String[] parts = message.split("\\|", 2);

		String email = parts[0];
		String token = parts[1];

		System.out.println("Password reset message received from RabbitMQ");
		System.out.println("Email: " + email);

		try {
			emailService.sendPasswordResetEmail(email, token);
			System.out.println("Password reset email sent to: " + email);
		} catch (Exception e) {
			System.out.println("Password reset email failed: " + e.getMessage());
		}
	}
}