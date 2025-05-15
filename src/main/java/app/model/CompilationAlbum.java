package app.model;

import com.fasterxml.jackson.annotation.JsonTypeName;

import app.enumerate.CompilationType;
import jakarta.persistence.Entity;

@Entity
@JsonTypeName("compilationAlbum")
public class CompilationAlbum extends Album {
	private CompilationType compilationType;

	public CompilationType getCompilationType() {
		return compilationType;
	}

	public void setCompilationType(CompilationType compilationType) {
		this.compilationType = compilationType;
	}
}
