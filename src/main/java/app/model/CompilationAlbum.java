package app.model;

import app.enumerate.CompilationType;
import jakarta.persistence.Entity;

@Entity
public class CompilationAlbum extends Album {
	private CompilationType CompilationType;

	public CompilationType getCompilationType() {
		return CompilationType;
	}

	public void setCompilationType(CompilationType compilationType) {
		CompilationType = compilationType;
	}
}
