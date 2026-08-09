package com.greetings.service;

import org.springframework.stereotype.Service;

import com.greetings.entity.User;
import com.greetings.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Register User
    public String registerUser(User user) {

        // Check duplicate username
        if (userRepository.existsByUsername(user.getUsername())) {
            return "Username already exists";
        }

        // Check duplicate email
        if (userRepository.existsByEmail(user.getEmail())) {
            return "Email already exists";
        }

        // Save user
        userRepository.save(user);

        return "Registration successful";
    }

    // Login User
    public User loginUser(String username, String password) {

        return userRepository.findByUsernameAndPassword(username, password);
    }
    
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}