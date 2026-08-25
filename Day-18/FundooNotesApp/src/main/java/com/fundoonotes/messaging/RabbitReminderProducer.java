package com.fundoonotes.messaging;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import com.fundoonotes.config.RabbitMQConfig;

@Component
public class RabbitReminderProducer {

	private final RabbitTemplate rabbitTemplate;

	public RabbitReminderProducer(RabbitTemplate rabbitTemplate) {
		this.rabbitTemplate = rabbitTemplate;
	}

	public void sendReminder(String noteTitle, int userId) {

		String message = noteTitle + "|" + userId;

		rabbitTemplate.convertAndSend(RabbitMQConfig.EXCHANGE_NAME, RabbitMQConfig.REMINDER_ROUTING_KEY, message);
	}
}