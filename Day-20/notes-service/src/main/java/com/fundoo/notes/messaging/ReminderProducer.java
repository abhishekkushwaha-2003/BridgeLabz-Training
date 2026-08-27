package com.fundoo.notes.messaging;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import com.fundoo.notes.config.RabbitMQConfig;

@Component
public class ReminderProducer {

	private final RabbitTemplate rabbitTemplate;

	public ReminderProducer(RabbitTemplate rabbitTemplate) {
		this.rabbitTemplate = rabbitTemplate;
	}

	public void sendReminder(int userId, int noteId, String title, String email) {
		String message = userId + "|" + noteId + "|" + title + "|" + email;

		rabbitTemplate.convertAndSend(RabbitMQConfig.REMINDER_QUEUE, message);

		System.out.println("Reminder message sent to RabbitMQ: " + message);
	}
}