package com.fundoonotes.dto.request;

import java.time.LocalDateTime;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;

public class ReminderRequest {

    @NotNull(message = "Reminder time is required")
    @Future(message = "Reminder time must be in the future")
    private LocalDateTime reminderAt;

    public LocalDateTime getReminderAt() {
        return reminderAt;
    }

    public void setReminderAt(LocalDateTime reminderAt) {
        this.reminderAt = reminderAt;
    }
}