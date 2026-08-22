package com.fundoonotes.service;

public interface UserService {

    String register(String email, String password, String name);

    String login(String email, String password);

    String forgotPassword(String email);

    void resetPassword(String token, String newPassword);
}