package app.exception;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import app.builder.FieldInputErrorBuilder;
import app.exception.error.FieldInputError;
import jakarta.validation.ConstraintViolationException;

@RestControllerAdvice
public class ErrorHandler {

//	@ExceptionHandler(MethodArgumentNotValidException.class)
//	protected ResponseEntity<List<FieldInputError>> handleMethodArgumentNotValid(MethodArgumentNotValidException ex) {
//
//		List<FieldError> collectedErrors = ex.getBindingResult().getFieldErrors();
//		
//		List<FieldInputError> responseErrors = collectedErrors.stream()
//																.map(error -> new FieldInputErrorBuilder()
//																					.withHttpStatus(HttpStatus.BAD_REQUEST)
//																					.inField(error.getField())
//																					.withMessage(error.getDefaultMessage())
//																					.build())
//																.collect(Collectors.toList());
//		
//		return new ResponseEntity<>(responseErrors, HttpStatus.BAD_REQUEST);
//	}
	
	@ExceptionHandler(ConstraintViolationException.class)
	protected ResponseEntity<List<FieldInputError>> handleConstraintViolationException(ConstraintViolationException ex) {

		List<FieldInputError> responseErrors = new ArrayList<>();
		
		ex.getConstraintViolations().forEach(error -> 
			responseErrors.add(new FieldInputErrorBuilder()
									.withHttpStatus(HttpStatus.BAD_REQUEST)
									.withMessage(error.getMessage())
									.inField(error.getPropertyPath() + "")
									.withReason(error.getInvalidValue() + "")
									.build())
		);
		
		return new ResponseEntity<>(responseErrors, HttpStatus.BAD_REQUEST);
	}
}
