package app.model;

import app.enumerate.CompilatonType;

public class CompilationAlbum extends Album {
	private CompilatonType CompilationType;

	public CompilatonType getCompilationType() {
		return CompilationType;
	}

	public void setCompilationType(CompilatonType compilationType) {
		CompilationType = compilationType;
	}
}
