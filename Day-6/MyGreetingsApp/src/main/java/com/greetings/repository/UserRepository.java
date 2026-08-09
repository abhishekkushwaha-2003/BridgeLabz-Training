package com.greetings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greetings.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByUsername(String username);

    boolean existsByEmail(String email);

    User findByUsernameAndPassword(String username, String password);
    
    User findByUsername(String username);
}