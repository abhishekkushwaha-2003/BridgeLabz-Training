package com.fundoo.auth.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.fundoo.auth.dto.request.LoginRequest;
import com.fundoo.auth.dto.request.RegisterRequest;
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

		String token = authService.register(request);

		return ResponseEntity.status(HttpStatus.CREATED).body(new AuthResponseDTO(token));
	}

	@PostMapping("/login")
	public ResponseEntity<AuthResponseDTO> login(@Valid @RequestBody LoginRequest request) {

		String token = authService.login(request);

		return ResponseEntity.ok(new AuthResponseDTO(token));
	}
}