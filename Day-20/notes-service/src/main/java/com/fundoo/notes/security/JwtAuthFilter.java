package com.fundoo.notes.security;

import java.io.IOException;
import java.util.Collections;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.fundoo.notes.service.RedisService;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtAuthFilter extends OncePerRequestFilter {

	private final JwtUtil jwtUtil;
	private final RedisService redisService;

	public JwtAuthFilter(JwtUtil jwtUtil, RedisService redisService) {
		this.jwtUtil = jwtUtil;
		this.redisService = redisService;
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {

		String authHeader = request.getHeader("Authorization");

		if (authHeader != null && authHeader.startsWith("Bearer ")) {

			String token = authHeader.substring(7);

			if (jwtUtil.isTokenValid(token)) {

				int userId = jwtUtil.extractUserId(token);
				String email = jwtUtil.extractEmail(token);

				try {
					if (redisService.isTokenCached(email, token)) {
						System.out.println("JWT token found in Redis cache");
					} else {
						System.out.println("JWT token not found in Redis cache, but JWT is valid");
					}
				} catch (Exception e) {
					System.out.println("Redis not available, validating JWT directly");
				}

				UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(
						String.valueOf(userId), null, Collections.emptyList());

				SecurityContextHolder.getContext().setAuthentication(authentication);
			}
		}

		filterChain.doFilter(request, response);
	}
}