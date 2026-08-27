package com.fundoo.auth.dto.client;

import lombok.Data;

@Data
public class AuthUserResponseDTO {

	private int userId;
	private String name;
	private String email;
	private String passwordHash;
}