package app.exception.error;

import org.springframework.http.HttpStatus;

public class Error {
	
	protected HttpStatus responseStatus;
	protected String message;
	
	// getters and setters
	public HttpStatus getResponseStatus() {
		return responseStatus;
	}

	public void setResponseStatus(HttpStatus responseStatus) {
		this.responseStatus = responseStatus;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
