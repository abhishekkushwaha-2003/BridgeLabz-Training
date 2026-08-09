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


    // Show Login Page
    @GetMapping("/login")
    public String showLoginPage() {

        return "login";
    }

    // Handle Login
    @PostMapping("/login")
    public String loginUser(
            @RequestParam String username,
            @RequestParam String password,
            Model model,
            HttpSession session) {

        User user = userService.loginUser(username, password);

        if (user != null) {

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

        User user = (User) session.getAttribute("user");

        if (user == null) {
            return "redirect:/login";
        }

        model.addAttribute("name", user.getName());

        return "home";
    }
    
    @GetMapping("/logout")
    public String logout(HttpSession session) {

        session.invalidate();

        return "redirect:/login";
    }
}