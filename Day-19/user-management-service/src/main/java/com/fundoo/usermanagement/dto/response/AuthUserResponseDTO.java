package com.fundoo.usermanagement.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthUserResponseDTO {

    private int userId;
    private String name;
    private String email;
    private String passwordHash;
}