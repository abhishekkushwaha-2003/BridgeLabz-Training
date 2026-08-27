package com.fundoo.auth.service.impl;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.fundoo.auth.client.UserClient;
import com.fundoo.auth.dto.client.AuthUserResponseDTO;
import com.fundoo.auth.dto.request.CreateUserRequest;
import com.fundoo.auth.dto.request.ForgotPasswordRequest;
import com.fundoo.auth.dto.request.LoginRequest;
import com.fundoo.auth.dto.request.RegisterRequest;
import com.fundoo.auth.dto.request.ResetPasswordRequest;
import com.fundoo.auth.dto.request.UpdatePasswordRequest;
import com.fundoo.auth.dto.response.AuthResponseDTO;
import com.fundoo.auth.entity.PasswordResetToken;
import com.fundoo.auth.messaging.PasswordResetProducer;
import com.fundoo.auth.repository.PasswordResetTokenRepository;
import com.fundoo.auth.security.JwtUtil;
import com.fundoo.auth.service.AuthService;
import com.fundoo.auth.service.RedisService;

@Service
public class AuthServiceImpl implements AuthService {

	private final UserClient userClient;
	private final JwtUtil jwtUtil;
	private final PasswordResetTokenRepository passwordResetTokenRepository;
	private final PasswordResetProducer passwordResetProducer;
	private final RedisService redisService;

	private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

	public AuthServiceImpl(UserClient userClient, JwtUtil jwtUtil,
			PasswordResetTokenRepository passwordResetTokenRepository, PasswordResetProducer passwordResetProducer,
			RedisService redisService) {

		this.userClient = userClient;
		this.jwtUtil = jwtUtil;
		this.passwordResetTokenRepository = passwordResetTokenRepository;
		this.passwordResetProducer = passwordResetProducer;
		this.redisService = redisService;
	}

	@Override
	public AuthResponseDTO register(RegisterRequest request) {

		String encodedPassword = passwordEncoder.encode(request.getPassword());

		CreateUserRequest createUserRequest = new CreateUserRequest();
		createUserRequest.setName(request.getName());
		createUserRequest.setEmail(request.getEmail());
		createUserRequest.setPasswordHash(encodedPassword);

		AuthUserResponseDTO user = userClient.createUser(createUserRequest);

		String token = jwtUtil.generateToken(String.valueOf(user.getUserId()), user.getEmail());
		redisService.saveToken(user.getEmail(), token);

		return new AuthResponseDTO(token);
	}

	@Override
	public AuthResponseDTO login(LoginRequest request) {

		AuthUserResponseDTO user;

		try {
			user = userClient.getUserByEmail(request.getEmail());
		} catch (Exception e) {
			throw new IllegalArgumentException("Invalid email or password");
		}

		if (!passwordEncoder.matches(request.getPassword(), user.getPasswordHash())) {
			throw new IllegalArgumentException("Invalid email or password");
		}

		String token = jwtUtil.generateToken(String.valueOf(user.getUserId()), user.getEmail());

		redisService.saveToken(user.getEmail(), token);

		return new AuthResponseDTO(token);
	}

	@Override
	public String forgotPassword(ForgotPasswordRequest request) {

		AuthUserResponseDTO user = userClient.getUserByEmail(request.getEmail());

		String token = UUID.randomUUID().toString();

		PasswordResetToken resetToken = new PasswordResetToken();
		resetToken.setToken(token);
		resetToken.setUserId(user.getUserId());
		resetToken.setEmail(user.getEmail());
		resetToken.setExpiryTime(LocalDateTime.now().plusMinutes(15));
		resetToken.setUsed(false);

		passwordResetTokenRepository.save(resetToken);

		passwordResetProducer.sendPasswordResetMessage(user.getEmail(), token);

		return token;
	}

	@Override
	public void resetPassword(ResetPasswordRequest request) {

		PasswordResetToken resetToken = passwordResetTokenRepository.findByToken(request.getToken())
				.orElseThrow(() -> new IllegalArgumentException("Invalid reset token"));

		if (resetToken.isUsed()) {
			throw new IllegalArgumentException("Reset token already used");
		}

		if (resetToken.getExpiryTime().isBefore(LocalDateTime.now())) {
			throw new IllegalArgumentException("Reset token expired");
		}

		String encodedPassword = passwordEncoder.encode(request.getNewPassword());

		UpdatePasswordRequest updatePasswordRequest = new UpdatePasswordRequest();
		updatePasswordRequest.setPasswordHash(encodedPassword);

		userClient.updatePassword(resetToken.getUserId(), updatePasswordRequest);

		resetToken.setUsed(true);
		passwordResetTokenRepository.save(resetToken);
	}
}