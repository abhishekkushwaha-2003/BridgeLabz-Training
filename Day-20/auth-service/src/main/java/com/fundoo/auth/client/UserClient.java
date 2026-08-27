package com.fundoo.auth.client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fundoo.auth.dto.client.AuthUserResponseDTO;
import com.fundoo.auth.dto.request.CreateUserRequest;
import com.fundoo.auth.dto.request.UpdatePasswordRequest;

@Component
public class UserClient {

	private final RestTemplate restTemplate;

	private static final String USER_SERVICE_URL = "http://user-management-service/users";

	public UserClient(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public AuthUserResponseDTO createUser(CreateUserRequest request) {
		return restTemplate.postForObject(USER_SERVICE_URL, request, AuthUserResponseDTO.class);
	}

	public AuthUserResponseDTO getUserByEmail(String email) {
		return restTemplate.getForObject(USER_SERVICE_URL + "/internal/email/" + email, AuthUserResponseDTO.class);
	}

	public void updatePassword(int userId, UpdatePasswordRequest request) {
		restTemplate.put(USER_SERVICE_URL + "/" + userId + "/password", request);
	}
}