package com.fundoo.auth.service.impl;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.fundoo.auth.client.UserClient;
import com.fundoo.auth.dto.client.CreateUserRequest;
import com.fundoo.auth.dto.client.UserResponseDTO;
import com.fundoo.auth.dto.request.LoginRequest;
import com.fundoo.auth.dto.request.RegisterRequest;
import com.fundoo.auth.security.JwtUtil;
import com.fundoo.auth.service.AuthService;

@Service
public class AuthServiceImpl implements AuthService {

	private final UserClient userClient;
	private final JwtUtil jwtUtil;
	private final BCryptPasswordEncoder passwordEncoder;

	public AuthServiceImpl(UserClient userClient, JwtUtil jwtUtil, BCryptPasswordEncoder passwordEncoder) {
		this.userClient = userClient;
		this.jwtUtil = jwtUtil;
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	public String register(RegisterRequest request) {

		String passwordHash = passwordEncoder.encode(request.getPassword());

		CreateUserRequest createUserRequest = new CreateUserRequest(request.getName(), request.getEmail(),
				passwordHash);

		UserResponseDTO savedUser = userClient.createUser(createUserRequest);

		return jwtUtil.generateToken(String.valueOf(savedUser.getUserId()), savedUser.getEmail());
	}

	@Override
	public String login(LoginRequest request) {

		UserResponseDTO user = userClient.getUserByEmail(request.getEmail());

		if (!passwordEncoder.matches(request.getPassword(), user.getPasswordHash())) {
			throw new IllegalArgumentException("Invalid email or password");
		}

		return jwtUtil.generateToken(String.valueOf(user.getUserId()), user.getEmail());
	}
}