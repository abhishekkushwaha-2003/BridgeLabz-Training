package com.fundoo.auth.service;

import java.time.Duration;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisService {

	private final StringRedisTemplate redisTemplate;

	public RedisService(StringRedisTemplate redisTemplate) {
		this.redisTemplate = redisTemplate;
	}

	public void saveToken(String email, String token) {
		redisTemplate.opsForValue().set("JWT_TOKEN_" + email, token, Duration.ofHours(24));

		System.out.println("JWT token saved in Redis for: " + email);
	}

	public String getToken(String email) {
		return redisTemplate.opsForValue().get("JWT_TOKEN_" + email);
	}
}