package com.fundoonotes.service.impl;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.fundoonotes.entity.PasswordResetToken;
import com.fundoonotes.entity.User;
import com.fundoonotes.messaging.ReminderProducer;
import com.fundoonotes.repository.PasswordResetTokenRepository;
import com.fundoonotes.repository.UserRepository;
import com.fundoonotes.security.JwtUtil;
import com.fundoonotes.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;
	private final JwtUtil jwtUtil;
	private final PasswordResetTokenRepository passwordResetTokenRepository;
	private final ReminderProducer reminderProducer;
	private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

	public UserServiceImpl(UserRepository userRepository, JwtUtil jwtUtil,
			PasswordResetTokenRepository passwordResetTokenRepository, ReminderProducer reminderProducer) {

		this.userRepository = userRepository;
		this.jwtUtil = jwtUtil;
		this.passwordResetTokenRepository = passwordResetTokenRepository;
		this.reminderProducer = reminderProducer;
	}

	@Override
	public String register(String email, String password, String name) {

		if (userRepository.findByEmail(email).isPresent()) {
			throw new IllegalArgumentException("Email already registered");
		}

		User user = new User();
		user.setEmail(email);
		user.setPasswordHash(passwordEncoder.encode(password));
		user.setName(name);

		User savedUser = userRepository.save(user);

		return jwtUtil.generateToken(String.valueOf(savedUser.getUserId()), savedUser.getEmail());
	}

	@Override
	public String login(String email, String password) {

		User user = userRepository.findByEmail(email)
				.orElseThrow(() -> new IllegalArgumentException("Invalid email or password"));

		if (!passwordEncoder.matches(password, user.getPasswordHash())) {
			throw new IllegalArgumentException("Invalid email or password");
		}

		return jwtUtil.generateToken(String.valueOf(user.getUserId()), user.getEmail());
	}

	@Override
	public String forgotPassword(String email) {

		User user = userRepository.findByEmail(email).orElseThrow(() -> new IllegalArgumentException("User not found"));

		String token = UUID.randomUUID().toString();

		PasswordResetToken resetToken = new PasswordResetToken();
		resetToken.setToken(token);
		resetToken.setUser(user);
		resetToken.setExpiryTime(LocalDateTime.now().plusMinutes(15));
		resetToken.setUsed(false);

		passwordResetTokenRepository.save(resetToken);

		reminderProducer.sendPasswordResetMessage(email, token);

		return token;
	}

	@Override
	public void resetPassword(String token, String newPassword) {

		PasswordResetToken resetToken = passwordResetTokenRepository.findByToken(token)
				.orElseThrow(() -> new IllegalArgumentException("Invalid recovery token"));

		if (resetToken.isUsed()) {
			throw new IllegalArgumentException("Recovery token has already been used");
		}

		if (resetToken.getExpiryTime().isBefore(LocalDateTime.now())) {
			throw new IllegalArgumentException("Recovery token has expired");
		}

		User user = resetToken.getUser();
		user.setPasswordHash(passwordEncoder.encode(newPassword));
		userRepository.save(user);

		resetToken.setUsed(true);
		passwordResetTokenRepository.save(resetToken);
	}
}