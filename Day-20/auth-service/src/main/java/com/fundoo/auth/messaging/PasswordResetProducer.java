package com.fundoo.auth.messaging;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import com.fundoo.auth.config.RabbitMQConfig;

@Component
public class PasswordResetProducer {

	private final RabbitTemplate rabbitTemplate;

	public PasswordResetProducer(RabbitTemplate rabbitTemplate) {
		this.rabbitTemplate = rabbitTemplate;
	}

	public void sendPasswordResetMessage(String email, String token) {

		String message = email + "|" + token;

		rabbitTemplate.convertAndSend(RabbitMQConfig.PASSWORD_RESET_QUEUE, message);

		System.out.println("Password reset message sent to RabbitMQ: " + email);
	}
}