package com.fundoo.auth.dto.client;

import lombok.Data;

@Data
public class UserResponseDTO {

	private int userId;
	private String name;
	private String email;
	private String passwordHash;
}