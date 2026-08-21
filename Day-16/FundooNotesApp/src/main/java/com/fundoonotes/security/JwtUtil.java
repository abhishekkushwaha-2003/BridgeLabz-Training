package com.fundoonotes.security;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtil {

	@Value("${jwt.secret}")
	private String secret;

	@Value("${jwt.expiration}")
	private long expirationMillis;

	private final StringRedisTemplate redisTemplate;

	public JwtUtil(StringRedisTemplate redisTemplate) {
		this.redisTemplate = redisTemplate;
	}

	private SecretKey getSigningKey() {
		return Keys.hmacShaKeyFor(secret.getBytes());
	}

	public String generateToken(String userId, String email) {
		return Jwts.builder().subject(userId).claim("email", email).issuedAt(new Date())
				.expiration(new Date(System.currentTimeMillis() + expirationMillis)).signWith(getSigningKey())
				.compact();
	}

	public String extractUserId(String token) {
		return Jwts.parser().verifyWith(getSigningKey()).build().parseSignedClaims(token).getPayload().getSubject();
	}

	public boolean isTokenValid(String token) {

		String cacheKey = "jwt:valid:" + token;

		try {
			String cachedValue = redisTemplate.opsForValue().get(cacheKey);

			if (cachedValue != null) {
				System.out.println("Redis Cache HIT for token");
				return Boolean.parseBoolean(cachedValue);
			}

			System.out.println("Redis Cache MISS for token");

		} catch (Exception e) {
			System.out.println("Redis not available, validating JWT directly");
		}

		try {
			Claims claims = Jwts.parser().verifyWith(getSigningKey()).build().parseSignedClaims(token).getPayload();

			long remainingTime = claims.getExpiration().getTime() - System.currentTimeMillis();

			if (remainingTime <= 0) {
				return false;
			}

			long cacheTime = Math.min(remainingTime, 60000);

			try {
				redisTemplate.opsForValue().set(cacheKey, "true", cacheTime, TimeUnit.MILLISECONDS);
			} catch (Exception e) {
				System.out.println("Redis not available, skipping JWT cache save");
			}

			return true;

		} catch (Exception e) {
			try {
				redisTemplate.opsForValue().set(cacheKey, "false", 30, TimeUnit.SECONDS);
			} catch (Exception redisException) {
				System.out.println("Redis not available, skipping invalid token cache");
			}

			return false;
		}
	}
}