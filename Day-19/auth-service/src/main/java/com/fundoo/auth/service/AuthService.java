package com.fundoo.auth.service;

import com.fundoo.auth.dto.request.LoginRequest;
import com.fundoo.auth.dto.request.RegisterRequest;

public interface AuthService {

	String register(RegisterRequest request);

	String login(LoginRequest request);
}