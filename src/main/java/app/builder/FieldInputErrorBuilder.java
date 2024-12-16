package app.builder;

import org.springframework.http.HttpStatus;
import app.exception.error.FieldInputError;

public class FieldInputErrorBuilder {

	private FieldInputError error;
	
	public FieldInputErrorBuilder() {
		this.error = new FieldInputError();
	}
	
	public FieldInputErrorBuilder withHttpStatus(HttpStatus status) {
		this.error.setResponseStatus(status);
		return this;
	}
	
	public FieldInputErrorBuilder withMessage(String message) {
		this.error.setMessage(message);
		return this;
	}
	
	public FieldInputErrorBuilder inField(String field) {
		this.error.setField(field);
		return this;
	}
	
	public FieldInputErrorBuilder withReason(String reason) {
		this.error.setValue(reason);
		return this;
	}
	
	public FieldInputError build() {
		return this.error;
	}
}
