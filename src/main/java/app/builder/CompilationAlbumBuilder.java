package app.builder;

import java.time.LocalDate;
import java.util.Map;
import java.util.Set;

import app.enumerate.CompilatonType;
import app.model.CompilationAlbum;
import app.model.Song;

public class CompilationAlbumBuilder {
	private CompilationAlbum compilationAlbum;
	
	public CompilationAlbumBuilder() {
		this.compilationAlbum = new CompilationAlbum();
	}
	
	public CompilationAlbumBuilder withTitle(String title) {
		this.compilationAlbum.setTitle(title);
		return this;
	}
	
	public CompilationAlbumBuilder withAlbumId(Integer albumId) {
		this.compilationAlbum.setAlbumId(albumId);
		return this;
	}
	
	public CompilationAlbumBuilder withSongs(Map<Integer, Song> songs) {
		this.compilationAlbum.setSongs(songs);
		return this;
	}
	
	public CompilationAlbumBuilder withReleaseDate(LocalDate releaseDate) {
		this.compilationAlbum.setReleaseDate(releaseDate);
		return this;
	}
	
	public CompilationAlbumBuilder withCatalogNumber(String catalogNumber) {
		this.compilationAlbum.setCatalogNumber(catalogNumber);
		return this;
	}
	
	public CompilationAlbumBuilder withCompilationType(CompilatonType compilationType) {
		this.compilationAlbum.setCompilationType(compilationType);
		return this;
	}
	
	public CompilationAlbum build() {
		return this.compilationAlbum;
	}
}
