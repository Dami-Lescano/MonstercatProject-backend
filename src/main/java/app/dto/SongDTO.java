package app.dto;

import java.util.List;

public class SongDTO {
	
	private Integer songId;
	private String title;
	private String releaseDate;
	private List<String> artists;
	private List<String> featuredArtists;
	private List<String> remixers;
	private String genre;
	private String length;
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
	public List<String> getArtists() {
		return artists;
	}
	public void setArtists(List<String> artists) {
		this.artists = artists;
	}
	public List<String> getFeaturedArtists() {
		return featuredArtists;
	}
	public void setFeaturedArtists(List<String> featuredArtists) {
		this.featuredArtists = featuredArtists;
	}
	public List<String> getRemixers() {
		return remixers;
	}
	public void setRemixers(List<String> remixers) {
		this.remixers = remixers;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getCatalogNumber() {
		return catalogNumber;
	}
	public void setCatalogNumber(String catalogNumber) {
		this.catalogNumber = catalogNumber;
	}
}
