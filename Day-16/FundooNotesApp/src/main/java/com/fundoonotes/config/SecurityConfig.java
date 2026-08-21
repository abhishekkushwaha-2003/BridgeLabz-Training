package com.fundoonotes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.fundoonotes.security.JwtAuthFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http, JwtAuthFilter jwtAuthFilter) throws Exception {

		http.csrf(csrf -> csrf.disable())
				.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
				.authorizeHttpRequests(
						auth -> auth
								.requestMatchers(HttpMethod.POST, "/auth/register", "/auth/login",
										"/auth/forgot-password", "/auth/reset-password")
								.permitAll().anyRequest().authenticated())
				.addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class);

		return http.build();
	}
}