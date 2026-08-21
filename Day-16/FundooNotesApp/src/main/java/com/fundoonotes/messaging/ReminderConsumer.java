package com.fundoonotes.messaging;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ReminderConsumer {

    @JmsListener(destination = "password-reset-queue")
    public void handlePasswordResetMessage(String message) {

        String[] parts = message.split("\\|");

        String email = parts[0];
        String resetToken = parts[1];

        sendPasswordResetEmail(email, resetToken);
    }

    @JmsListener(destination = "note-reminder-queue")
    public void handleNoteReminderMessage(String message) {

        String[] parts = message.split("\\|");

        String userId = parts[0];
        String noteId = parts[1];
        String title = parts[2];

        System.out.println("REMINDER: User " + userId
                + " has reminder for note " + noteId
                + " - " + title);
    }

    private void sendPasswordResetEmail(String email, String resetToken) {

        try {
            Thread.sleep(3000);

            System.out.println("Password reset email sent to: " + email);
            System.out.println("Reset token: " + resetToken);

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}