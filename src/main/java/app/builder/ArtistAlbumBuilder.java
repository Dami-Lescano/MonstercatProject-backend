package app.builder;

import java.time.LocalDate;
import java.util.Map;
import java.util.Set;

import app.model.Artist;
import app.model.ArtistAlbum;
import app.model.Song;

public class ArtistAlbumBuilder {
	private ArtistAlbum artistAlbum;
	
	public ArtistAlbumBuilder() {
		this.artistAlbum = new ArtistAlbum();
	}
	
	public ArtistAlbumBuilder withTitle(String title) {
		this.artistAlbum.setTitle(title);
		return this;
	}
	
	public ArtistAlbumBuilder withAlbumId(Integer albumId) {
		this.artistAlbum.setAlbumId(albumId);
		return this;
	}
	
	public ArtistAlbumBuilder withSongs(Map<Integer, Song> songs) {
		this.artistAlbum.setSongs(songs);
		return this;
	}
	
	public ArtistAlbumBuilder withReleaseDate(LocalDate releaseDate) {
		this.artistAlbum.setReleaseDate(releaseDate);
		return this;
	}
	
	public ArtistAlbumBuilder withCatalogNumber(String catalogNumber) {
		this.artistAlbum.setCatalogNumber(catalogNumber);
		return this;
	}
	
	public ArtistAlbumBuilder withArtists(Set<Artist> artists) {
		this.artistAlbum.setArtists(artists);
		return this;
	}
	
	public ArtistAlbum build() {
		return this.artistAlbum;
	}
}
