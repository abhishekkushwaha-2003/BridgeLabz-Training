package com.fundoonotes.messaging;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class ReminderProducer {

    private final JmsTemplate jmsTemplate;

    public ReminderProducer(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void sendPasswordResetMessage(String email, String resetToken) {

        String message = email + "|" + resetToken;

        jmsTemplate.convertAndSend("password-reset-queue", message);
    }

    public void sendNoteReminderMessage(int userId, int noteId, String title) {

        String message = userId + "|" + noteId + "|" + title;

        jmsTemplate.convertAndSend("note-reminder-queue", message);
    }
}