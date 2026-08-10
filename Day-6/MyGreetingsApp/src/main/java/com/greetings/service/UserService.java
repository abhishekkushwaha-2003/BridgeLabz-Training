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


    public User loginUser(String username, String password) {

        return userRepository.findByUsernameAndPassword(username, password);
    }


    public String updateUsername(Long userId, String newUsername) {

        // Check if username is already used
        if (userRepository.existsByUsername(newUsername)) {
            return "Username already exists";
        }

        // Find current user
        User user = userRepository.findById(userId).orElse(null);

        if (user == null) {
            return "User not found";
        }

        // Update username
        user.setUsername(newUsername);

        // Save updated user
        userRepository.save(user);

        return "Username updated successfully";
    }
    
    public void deleteUser(Long userId) {

        userRepository.deleteById(userId);
    }
}