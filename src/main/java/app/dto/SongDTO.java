package app.dto;

import java.util.List;

import app.enumerate.Genre;

public class SongDTO {
	
	private Integer songId;
	private String title;
	private String releaseDate;
	private List<ArtistItem> artists;
	private List<ArtistItem> featuredArtists;
	private List<ArtistItem> remixers;
	private Genre genre;
	private String genreName;
	private String length;
	private int lengthMinutes;
	private int lengthSeconds;
	private String catalogNumber;
	
	public Integer getSongId() {
		return songId;
	}
	public void setSongId(Integer songId) {
		this.songId = songId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public List<ArtistItem> getArtists() {
		return artists;
	}
	public void setArtists(List<ArtistItem> artists) {
		this.artists = artists;
	}
	public List<ArtistItem> getFeaturedArtists() {
		return featuredArtists;
	}
	public void setFeaturedArtists(List<ArtistItem> featuredArtists) {
		this.featuredArtists = featuredArtists;
	}
	public List<ArtistItem> getRemixers() {
		return remixers;
	}
	public void setRemixers(List<ArtistItem> remixers) {
		this.remixers = remixers;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public String getGenreName() {
		return genreName;
	}
	public void setGenreName(String genre) {
		this.genreName = genre;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public int getLengthMinutes() {
		return lengthMinutes;
	}
	public void setLengthMinutes(int lengthMinutes) {
		this.lengthMinutes = lengthMinutes;
	}
	public int getLengthSeconds() {
		return lengthSeconds;
	}
	public void setLengthSeconds(int lengthSeconds) {
		this.lengthSeconds = lengthSeconds;
	}
	public String getCatalogNumber() {
		return catalogNumber;
	}
	public void setCatalogNumber(String catalogNumber) {
		this.catalogNumber = catalogNumber;
	}
}
