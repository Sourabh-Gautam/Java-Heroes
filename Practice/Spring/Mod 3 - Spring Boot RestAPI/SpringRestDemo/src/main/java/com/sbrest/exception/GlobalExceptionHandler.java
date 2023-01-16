package com.sbrest.exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.sbrest.model.ErrorDetails;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorDetails> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex, WebRequest request) {
		ErrorDetails details = new ErrorDetails();
		details.setDescription(request.getDescription(true));
		details.setMessage(ex.getFieldError().getDefaultMessage());
		details.setTimestamp(LocalDate.now());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(details);
	}
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<ErrorDetails> noUserFound(Exception exception,WebRequest request) {
		ErrorDetails error = new ErrorDetails();
		error.setDescription(request.getDescription(true));
		error.setMessage(exception.getMessage());
		error.setTimestamp(LocalDate.now());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}
	
}
