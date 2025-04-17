package app.dto;

import app.enumerate.CompilationType;

public class CompilationTypeDTO {
	private CompilationType compilationType;
	private String tipo;
	private String type;
	
	public CompilationType getCompilationType() {
		return compilationType;
	}
	public void setCompilationType(CompilationType compilationType) {
		this.compilationType = compilationType;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
