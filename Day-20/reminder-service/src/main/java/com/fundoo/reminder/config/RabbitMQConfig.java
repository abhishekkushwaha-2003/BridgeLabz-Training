package com.fundoo.reminder.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

	public static final String REMINDER_QUEUE = "reminder-queue";
	public static final String PASSWORD_RESET_QUEUE = "password-reset-queue";

	@Bean
	public Queue reminderQueue() {
		return new Queue(REMINDER_QUEUE, true);
	}

	@Bean
	public Queue passwordResetQueue() {
		return new Queue(PASSWORD_RESET_QUEUE, true);
	}
}