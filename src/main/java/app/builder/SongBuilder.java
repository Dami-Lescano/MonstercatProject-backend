package app.builder;

import java.time.LocalDate;
import java.util.Set;

import app.enumerate.Genre;
import app.model.Artist;
import app.model.Converter;
import app.model.Song;

public class SongBuilder {
	
	private Song song;
	
	public SongBuilder() {
		this.song = new Song();
	}
	
	public SongBuilder withTitle(String title) {
		this.song.setTitle(title);
		return this;
	}
	
	public SongBuilder withArtists(Set<Artist> artists) {
		this.song.setArtists(artists);
		return this;
	}
	
	public SongBuilder withFeaturedArtists(Set<Artist> featuredArtists) {
		this.song.setFeaturedArtists(featuredArtists);
		return this;
	}
	
	public SongBuilder withLength(int minutes, int seconds) {
		int length = Converter.lengthToInt(minutes, seconds);
		this.song.setLength(length);
		return this;
	}
	
	public SongBuilder withGenre(Genre genre) {
		this.song.setGenre(genre);
		return this;
	}
	
	public SongBuilder withReleaseDate(LocalDate releaseDate) {
		this.song.setReleaseDate(releaseDate);
		return this;
	}
	
	public SongBuilder withCatalogNumber(String catalogNumber) {
		this.song.setCatalogNumber(catalogNumber);
		return this;
	}
	
	public SongBuilder withSongId(Integer songId) {
		this.song.setSongId(songId);
		return this;
	}
	
	public Song buildSong() {
		return this.song;
	}
	
}
