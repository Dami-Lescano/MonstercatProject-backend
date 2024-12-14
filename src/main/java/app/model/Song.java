package app.model;

import java.time.LocalDate;

import app.enumerate.Genre;

public class Song {
	private Integer songId;
	
	private String title;
	private LocalDate releaseDate;
	private Genre genre = Genre.UNKNOWN;
	//private String subGenre;
	private Integer length = 0;
	private String catalogNumber;
	
	//getters y setters
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
	
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	public Genre getGenre() {
		return genre;
	}
	
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
	public Integer getLength() {
		return length;
	}
	
	public void setLength(Integer length) {
		this.length = length;
	}
	
	public String getCatalogNumber() {
		return catalogNumber;
	}
	
	public void setCatalogNumber(String catalogNumber) {
		this.catalogNumber = catalogNumber;
	}
	
	
}
