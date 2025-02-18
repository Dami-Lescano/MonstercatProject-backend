package app.exception.error;

public class FieldInputError extends Error {

	private String field;
	private String value;
	
	// getters and setters
	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String reason) {
		this.value = reason;
	}
}
