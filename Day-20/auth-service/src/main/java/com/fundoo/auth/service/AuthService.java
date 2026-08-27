package com.fundoo.auth.service;

import com.fundoo.auth.dto.request.ForgotPasswordRequest;
import com.fundoo.auth.dto.request.LoginRequest;
import com.fundoo.auth.dto.request.RegisterRequest;
import com.fundoo.auth.dto.request.ResetPasswordRequest;
import com.fundoo.auth.dto.response.AuthResponseDTO;

public interface AuthService {

    AuthResponseDTO register(RegisterRequest request);

    AuthResponseDTO login(LoginRequest request);

    String forgotPassword(ForgotPasswordRequest request);

    void resetPassword(ResetPasswordRequest request);
}