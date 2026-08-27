package com.fundoo.notes.dto.client;

import lombok.Data;

@Data
public class UserResponseDTO {

    private int userId;
    private String name;
    private String email;
}