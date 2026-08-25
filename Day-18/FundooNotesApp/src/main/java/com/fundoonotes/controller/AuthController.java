package com.fundoonotes.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fundoonotes.dto.request.ForgotPasswordRequest;
import com.fundoonotes.dto.request.LoginRequest;
import com.fundoonotes.dto.request.RegisterRequest;
import com.fundoonotes.dto.request.ResetPasswordRequest;
import com.fundoonotes.dto.response.AuthResponseDTO;
import com.fundoonotes.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<AuthResponseDTO> register(@Valid @RequestBody RegisterRequest request) {

        String token = userService.register(
                request.getEmail(),
                request.getPassword(),
                request.getName()
        );

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new AuthResponseDTO(token));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponseDTO> login(@Valid @RequestBody LoginRequest request) {

        String token = userService.login(
                request.getEmail(),
                request.getPassword()
        );

        return ResponseEntity.ok(new AuthResponseDTO(token));
    }
    
    @PostMapping("/forgot-password")
    public ResponseEntity<Map<String, String>> forgotPassword(
            @Valid @RequestBody ForgotPasswordRequest request) {

        String token = userService.forgotPassword(request.getEmail());

        return ResponseEntity.ok(Map.of(
                "message", "Password reset token generated",
                "token", token
        ));
    }

    @PostMapping("/reset-password")
    public ResponseEntity<Map<String, String>> resetPassword(
            @Valid @RequestBody ResetPasswordRequest request) {

        userService.resetPassword(
                request.getToken(),
                request.getNewPassword()
        );

        return ResponseEntity.ok(Map.of(
                "message", "Password reset successfully"
        ));
    }
}