package com.fundoo.usermanagement.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UpdatePasswordRequest {

	@NotBlank(message = "Password hash is required")
	private String passwordHash;
}