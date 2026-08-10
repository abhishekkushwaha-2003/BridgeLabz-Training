package com.greetings.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.greetings.entity.User;
import com.greetings.service.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }
    
    @GetMapping("/register")
    public String showRegisterPage(Model model) {

        model.addAttribute("user", new User());

        return "register";
    }

    @PostMapping("/register")
    public String registerUser(
            @Valid User user,
            BindingResult result,
            Model model) {

        // Validation errors
        if (result.hasErrors()) {

            model.addAttribute("errors",
                    result.getFieldErrors()
                            .stream()
                            .collect(java.util.stream.Collectors.toMap(
                                    error -> error.getField(),
                                    error -> error.getDefaultMessage(),
                                    (existing, replacement) -> existing
                            )));

            return "register";
        }

        // Save user
        String message = userService.registerUser(user);

        // Duplicate username/email
        if (!message.equals("Registration successful")) {

            model.addAttribute("error", message);

            return "register";
        }

        // Registration successful
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String showLoginPage() {

        return "login";
    }

    @PostMapping("/login")
    public String loginUser(
            @RequestParam String username,
            @RequestParam String password,
            Model model,
            HttpSession session) {

        User user = userService.loginUser(username, password);

        if (user != null) {

            // Store logged-in user in session
            session.setAttribute("user", user);

            return "redirect:/home";
        }

        model.addAttribute("error", "Invalid username or password");

        return "login";
    }


    @GetMapping("/home")
    public String showHomePage(
            HttpSession session,
            Model model) {

        // Get logged-in user from session
        User user = (User) session.getAttribute("user");

        // If user is not logged in
        if (user == null) {
            return "redirect:/login";
        }

        // Send user details to Thymeleaf
        model.addAttribute("name", user.getName());
        model.addAttribute("email", user.getEmail());
        model.addAttribute("username", user.getUsername());

        return "home";
    }


    @PostMapping("/update-username")
    public String updateUsername(
            @RequestParam String username,
            HttpSession session,
            Model model) {

        // Get logged-in user from session
        User user = (User) session.getAttribute("user");

        // If user is not logged in
        if (user == null) {
            return "redirect:/login";
        }

        // Update username in database
        String message = userService.updateUsername(
                user.getId(),
                username
        );

        // If update failed
        if (!message.equals("Username updated successfully")) {

            model.addAttribute("error", message);

            // Send existing user details back to home page
            model.addAttribute("name", user.getName());
            model.addAttribute("email", user.getEmail());
            model.addAttribute("username", user.getUsername());

            return "home";
        }

        // Update username in session also
        user.setUsername(username);
        session.setAttribute("user", user);

        // Go back to home page
        return "redirect:/home";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {

        // Destroy session
        session.invalidate();

        return "redirect:/login";
    }
    
    @PostMapping("/delete-account")
    public String deleteAccount(HttpSession session) {

        // Get logged-in user from session
        User user = (User) session.getAttribute("user");

        // If user is not logged in
        if (user == null) {
            return "redirect:/login";
        }

        // Delete user from database
        userService.deleteUser(user.getId());

        // Destroy session
        session.invalidate();

        // Go to login page
        return "redirect:/login";
    }
}