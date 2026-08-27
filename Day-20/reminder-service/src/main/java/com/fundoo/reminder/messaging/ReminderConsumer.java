package com.fundoo.reminder.messaging;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.fundoo.reminder.config.RabbitMQConfig;
import com.fundoo.reminder.service.EmailService;

@Component
public class ReminderConsumer {

	private final EmailService emailService;

	public ReminderConsumer(EmailService emailService) {
		this.emailService = emailService;
	}

	@RabbitListener(queues = RabbitMQConfig.REMINDER_QUEUE)
	public void consumeReminder(String message) {

		String[] parts = message.split("\\|", 4);

		int userId = Integer.parseInt(parts[0]);
		int noteId = Integer.parseInt(parts[1]);
		String title = parts[2];
		String email = parts[3];

		System.out.println("Reminder received from RabbitMQ");
		System.out.println("User ID: " + userId);
		System.out.println("Note ID: " + noteId);
		System.out.println("Title: " + title);
		System.out.println("Email: " + email);

		try {
			emailService.sendReminderEmail(email, title);
			System.out.println("Reminder email sent to: " + email);
		} catch (Exception e) {
			System.out.println("Reminder email failed: " + e.getMessage());
		}
	}
}