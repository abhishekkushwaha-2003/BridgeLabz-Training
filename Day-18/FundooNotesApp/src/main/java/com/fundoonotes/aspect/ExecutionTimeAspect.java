package com.fundoonotes.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExecutionTimeAspect {

	private static final Logger logger = LoggerFactory.getLogger(ExecutionTimeAspect.class);

	@Around("execution(* com.fundoonotes.service..*.*(..))")
	public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {

		long startTime = System.currentTimeMillis();

		Object result = joinPoint.proceed();

		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;

		logger.info("{} executed in {} ms", joinPoint.getSignature().toShortString(), duration);

		return result;
	}
}