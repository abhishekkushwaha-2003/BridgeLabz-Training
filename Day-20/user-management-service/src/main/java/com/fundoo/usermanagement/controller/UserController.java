package com.fundoo.usermanagement.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.fundoo.usermanagement.dto.request.CreateUserRequest;
import com.fundoo.usermanagement.dto.request.UpdatePasswordRequest;
import com.fundoo.usermanagement.dto.response.AuthUserResponseDTO;
import com.fundoo.usermanagement.dto.response.UserResponseDTO;
import com.fundoo.usermanagement.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@PostMapping
	public ResponseEntity<UserResponseDTO> createUser(@Valid @RequestBody CreateUserRequest request) {
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(request));
	}

	@GetMapping("/email/{email}")
	public ResponseEntity<UserResponseDTO> getUserByEmail(@PathVariable String email) {
		return ResponseEntity.ok(userService.getUserByEmail(email));
	}

	@GetMapping("/internal/email/{email}")
	public ResponseEntity<AuthUserResponseDTO> getAuthUserByEmail(@PathVariable String email) {
		return ResponseEntity.ok(userService.getAuthUserByEmail(email));
	}

	@GetMapping("/{userId}")
	public ResponseEntity<UserResponseDTO> getUserById(@PathVariable int userId) {
		return ResponseEntity.ok(userService.getUserById(userId));
	}

	@PutMapping("/{userId}/password")
	public ResponseEntity<Void> updatePassword(@PathVariable int userId,
			@Valid @RequestBody UpdatePasswordRequest request) {

		userService.updatePassword(userId, request);
		return ResponseEntity.noContent().build();
	}
}