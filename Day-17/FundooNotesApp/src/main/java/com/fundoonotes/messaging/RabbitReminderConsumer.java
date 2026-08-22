package com.fundoonotes.messaging;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.fundoonotes.config.RabbitMQConfig;

@Component
public class RabbitReminderConsumer {

	@RabbitListener(queues = RabbitMQConfig.REMINDER_QUEUE)
	public void handleReminder(String message) {

		String[] parts = message.split("\\|");

		String noteTitle = parts[0];
		String userId = parts[1];

		System.out.println("REMINDER via RabbitMQ: note = " + noteTitle + ", userId = " + userId);
	}
}