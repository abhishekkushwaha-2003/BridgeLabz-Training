package com.fundoo.notes.service;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisService {

	private final StringRedisTemplate redisTemplate;

	public RedisService(StringRedisTemplate redisTemplate) {
		this.redisTemplate = redisTemplate;
	}

	public boolean isTokenCached(String email, String token) {
		String cachedToken = redisTemplate.opsForValue().get("JWT_TOKEN_" + email);

		return token.equals(cachedToken);
	}
}