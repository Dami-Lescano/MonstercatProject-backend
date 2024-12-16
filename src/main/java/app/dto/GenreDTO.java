package app.dto;

import app.enumerate.Genre;

public class GenreDTO {
	private Genre genre;
	private String name;
	private String hexColor;
	
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHexColor() {
		return hexColor;
	}
	public void setHexColor(String hexColor) {
		this.hexColor = hexColor;
	}
	
	
}
