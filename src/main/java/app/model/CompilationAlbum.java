package app.model;

import app.enumerate.CompilatonType;
import jakarta.persistence.Entity;

@Entity
public class CompilationAlbum extends Album {
	private CompilatonType CompilationType;

	public CompilatonType getCompilationType() {
		return CompilationType;
	}

	public void setCompilationType(CompilatonType compilationType) {
		CompilationType = compilationType;
	}
}
