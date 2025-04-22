package app.model;

import app.enumerate.CompilationType;
import jakarta.persistence.Entity;

@Entity
public class CompilationAlbum extends Album {
	private CompilationType compilationType;

	public CompilationType getCompilationType() {
		return compilationType;
	}

	public void setCompilationType(CompilationType compilationType) {
		this.compilationType = compilationType;
	}
}
