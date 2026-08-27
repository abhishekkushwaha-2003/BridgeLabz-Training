package com.fundoo.notes.client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fundoo.notes.dto.client.UserResponseDTO;

@Component
public class UserClient {

    private final RestTemplate restTemplate;

    private static final String USER_SERVICE_URL = "http://user-management-service/users";

    public UserClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public UserResponseDTO getUserById(int userId) {
        return restTemplate.getForObject(USER_SERVICE_URL + "/" + userId, UserResponseDTO.class);
    }
}