package com.fundoo.auth.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.fundoo.auth.dto.request.ForgotPasswordRequest;
import com.fundoo.auth.dto.request.LoginRequest;
import com.fundoo.auth.dto.request.RegisterRequest;
import com.fundoo.auth.dto.request.ResetPasswordRequest;
import com.fundoo.auth.dto.response.AuthResponseDTO;
import com.fundoo.auth.service.AuthService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/auth")
public class AuthController {

	private final AuthService authService;

	public AuthController(AuthService authService) {
		this.authService = authService;
	}

	@PostMapping("/register")
	public ResponseEntity<AuthResponseDTO> register(@Valid @RequestBody RegisterRequest request) {
		return ResponseEntity.status(HttpStatus.CREATED).body(authService.register(request));
	}

	@PostMapping("/login")
	public ResponseEntity<AuthResponseDTO> login(@Valid @RequestBody LoginRequest request) {
		return ResponseEntity.ok(authService.login(request));
	}

	@PostMapping("/forgot-password")
	public ResponseEntity<String> forgotPassword(@Valid @RequestBody ForgotPasswordRequest request) {
		String token = authService.forgotPassword(request);

		return ResponseEntity.ok("Password reset token generated: " + token);
	}

	@PostMapping("/reset-password")
	public ResponseEntity<String> resetPassword(@Valid @RequestBody ResetPasswordRequest request) {
		authService.resetPassword(request);

		return ResponseEntity.ok("Password reset successfully");
	}
}