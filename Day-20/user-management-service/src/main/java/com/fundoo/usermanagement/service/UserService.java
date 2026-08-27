package com.fundoo.usermanagement.service;

import com.fundoo.usermanagement.dto.request.CreateUserRequest;
import com.fundoo.usermanagement.dto.request.UpdatePasswordRequest;
import com.fundoo.usermanagement.dto.response.AuthUserResponseDTO;
import com.fundoo.usermanagement.dto.response.UserResponseDTO;

public interface UserService {

    UserResponseDTO createUser(CreateUserRequest request);

    UserResponseDTO getUserByEmail(String email);

    AuthUserResponseDTO getAuthUserByEmail(String email);

    UserResponseDTO getUserById(int userId);

    void updatePassword(int userId, UpdatePasswordRequest request);
}