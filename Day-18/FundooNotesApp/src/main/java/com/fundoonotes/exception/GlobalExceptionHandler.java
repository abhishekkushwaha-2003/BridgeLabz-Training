package com.fundoonotes.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.fundoonotes.dto.response.ErrorResponseDTO;

@RestControllerAdvice
public class GlobalExceptionHandler {

	private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

	@ExceptionHandler(DuplicateEmailException.class)
	public ResponseEntity<ErrorResponseDTO> handleDuplicateEmail(DuplicateEmailException exception) {

		logger.warn("Duplicate email attempt: {}", exception.getMessage());

		return ResponseEntity.status(HttpStatus.CONFLICT).body(new ErrorResponseDTO(exception.getMessage(), 409));
	}

	@ExceptionHandler(InvalidCredentialsException.class)
	public ResponseEntity<ErrorResponseDTO> handleInvalidCredentials(InvalidCredentialsException exception) {

		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ErrorResponseDTO(exception.getMessage(), 401));
	}

	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<ErrorResponseDTO> handleUserNotFound(UserNotFoundException exception) {

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ErrorResponseDTO(exception.getMessage(), 404));
	}

	@ExceptionHandler(NoteNotFoundException.class)
	public ResponseEntity<ErrorResponseDTO> handleNoteNotFound(NoteNotFoundException exception) {

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ErrorResponseDTO(exception.getMessage(), 404));
	}

	@ExceptionHandler(InvalidNoteStateException.class)
	public ResponseEntity<ErrorResponseDTO> handleInvalidNoteState(InvalidNoteStateException exception) {

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorResponseDTO(exception.getMessage(), 400));
	}

	@ExceptionHandler(TokenException.class)
	public ResponseEntity<ErrorResponseDTO> handleTokenException(TokenException exception) {

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorResponseDTO(exception.getMessage(), 400));
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorResponseDTO> handleValidationError(MethodArgumentNotValidException exception) {

		String message = exception.getBindingResult().getFieldError().getDefaultMessage();

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorResponseDTO(message, 400));
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponseDTO> handleUnexpectedException(Exception exception) {

		logger.error("Unexpected error occurred", exception);

		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
				.body(new ErrorResponseDTO("An unexpected error occurred", 500));
	}
}