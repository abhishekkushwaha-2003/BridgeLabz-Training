package com.fundoo.auth.client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fundoo.auth.dto.client.CreateUserRequest;
import com.fundoo.auth.dto.client.UserResponseDTO;

@Component
public class UserClient {

	private final RestTemplate restTemplate;

	private static final String USER_SERVICE_URL = "http://user-management-service/users";

	public UserClient(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public UserResponseDTO createUser(CreateUserRequest request) {
		return restTemplate.postForObject(USER_SERVICE_URL, request, UserResponseDTO.class);
	}

	public UserResponseDTO getUserByEmail(String email) {
		return restTemplate.getForObject(USER_SERVICE_URL + "/internal/email/" + email, UserResponseDTO.class);
	}
}