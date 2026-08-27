package com.fundoo.usermanagement.service.impl;

import org.springframework.stereotype.Service;

import com.fundoo.usermanagement.dto.request.CreateUserRequest;
import com.fundoo.usermanagement.dto.request.UpdatePasswordRequest;
import com.fundoo.usermanagement.dto.response.AuthUserResponseDTO;
import com.fundoo.usermanagement.dto.response.UserResponseDTO;
import com.fundoo.usermanagement.entity.User;
import com.fundoo.usermanagement.repository.UserRepository;
import com.fundoo.usermanagement.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public UserResponseDTO createUser(CreateUserRequest request) {

		if (userRepository.findByEmail(request.getEmail()).isPresent()) {
			throw new IllegalArgumentException("Email already registered");
		}

		User user = new User();
		user.setName(request.getName());
		user.setEmail(request.getEmail());
		user.setPasswordHash(request.getPasswordHash());

		User savedUser = userRepository.save(user);

		return mapToResponse(savedUser);
	}

	@Override
	public UserResponseDTO getUserByEmail(String email) {

		User user = userRepository.findByEmail(email).orElseThrow(() -> new IllegalArgumentException("User not found"));

		return mapToResponse(user);
	}

	@Override
	public AuthUserResponseDTO getAuthUserByEmail(String email) {

		User user = userRepository.findByEmail(email).orElseThrow(() -> new IllegalArgumentException("User not found"));

		return mapToAuthResponse(user);
	}

	@Override
	public UserResponseDTO getUserById(int userId) {

		User user = userRepository.findById(userId).orElseThrow(() -> new IllegalArgumentException("User not found"));

		return mapToResponse(user);
	}

	@Override
	public void updatePassword(int userId, UpdatePasswordRequest request) {

		User user = userRepository.findById(userId).orElseThrow(() -> new IllegalArgumentException("User not found"));

		user.setPasswordHash(request.getPasswordHash());

		userRepository.save(user);
	}

	private UserResponseDTO mapToResponse(User user) {
		return new UserResponseDTO(user.getUserId(), user.getName(), user.getEmail());
	}

	private AuthUserResponseDTO mapToAuthResponse(User user) {
		return new AuthUserResponseDTO(user.getUserId(), user.getName(), user.getEmail(), user.getPasswordHash());
	}
}