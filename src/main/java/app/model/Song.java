package app.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import app.enumerate.Genre;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Song {
	
	protected static final String DATE_PATTERN = "yyyy-MM-dd";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer songId;
	
	private String title;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DATE_PATTERN)
	private LocalDate releaseDate;
	private Genre genre = Genre.UNKNOWN;
	//private SubGenre subGenre;
	private Integer length = 0;
	private String catalogNumber;
	
	public String getLengthInString() {
		return Converter.intToLength(this.length);
	}
	
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
