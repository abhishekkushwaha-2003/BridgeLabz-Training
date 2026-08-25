package com.fundoonotes.service.impl;

import java.time.LocalDateTime;
import com.fundoonotes.service.EmailService;
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
import com.fundoonotes.exception.DuplicateEmailException;
import com.fundoonotes.exception.InvalidCredentialsException;
import com.fundoonotes.exception.TokenException;
import com.fundoonotes.exception.UserNotFoundException;

@Service
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;
	private final JwtUtil jwtUtil;
	private final PasswordResetTokenRepository passwordResetTokenRepository;
	private final ReminderProducer reminderProducer;
	private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	private final EmailService emailService;

	public UserServiceImpl(UserRepository userRepository, JwtUtil jwtUtil,
			PasswordResetTokenRepository passwordResetTokenRepository, ReminderProducer reminderProducer,
			EmailService emailService) {

		this.userRepository = userRepository;
		this.jwtUtil = jwtUtil;
		this.passwordResetTokenRepository = passwordResetTokenRepository;
		this.reminderProducer = reminderProducer;
		this.emailService = emailService;
	}

	@Override
	public String register(String email, String password, String name) {

		if (userRepository.findByEmail(email).isPresent()) {
			throw new DuplicateEmailException(email);
		}

		User user = new User();
		user.setEmail(email);
		user.setPasswordHash(passwordEncoder.encode(password));
		user.setName(name);

		User savedUser = userRepository.save(user);

		try {
			emailService.sendWelcomeEmail(savedUser.getEmail(), savedUser.getName());
			System.out.println("Welcome email sent to: " + savedUser.getEmail());
		} catch (Exception e) {
			System.out.println("Welcome email failed: " + e.getMessage());
		}

		return jwtUtil.generateToken(String.valueOf(savedUser.getUserId()), savedUser.getEmail());

	}

	@Override
	public String login(String email, String password) {

		User user = userRepository.findByEmail(email).orElseThrow(InvalidCredentialsException::new);

		if (!passwordEncoder.matches(password, user.getPasswordHash())) {
			throw new InvalidCredentialsException();
		}

		return jwtUtil.generateToken(String.valueOf(user.getUserId()), user.getEmail());
	}

	@Override
	public String forgotPassword(String email) {

		User user = userRepository.findByEmail(email).orElseThrow(UserNotFoundException::new);

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
				.orElseThrow(() -> new TokenException("Invalid recovery token"));

		if (resetToken.isUsed()) {
			throw new TokenException("Recovery token has already been used");
		}

		if (resetToken.getExpiryTime().isBefore(LocalDateTime.now())) {
			throw new TokenException("Recovery token has expired");
		}

		User user = resetToken.getUser();
		user.setPasswordHash(passwordEncoder.encode(newPassword));
		userRepository.save(user);

		resetToken.setUsed(true);
		passwordResetTokenRepository.save(resetToken);
	}
}