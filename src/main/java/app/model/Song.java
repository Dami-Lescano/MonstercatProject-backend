package app.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonFormat;

import app.enumerate.Genre;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
public class Song {
	
	protected static final String DATE_PATTERN = "yyyy-MM-dd";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer songId;
	
	@NotBlank(message = "La canción debe tener un título.")
	private String title;
	
	@NotNull(message = "La canción debe tener una fecha de lanzamiento")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DATE_PATTERN)
	private LocalDate releaseDate;

	@ManyToMany
	@NotEmpty(message = "Debe tener por lo menos un artista.")
	private Set<Artist> artists = new HashSet<Artist>();
	
	@OneToMany
	private Set<Artist> featuredArtists = new HashSet<Artist>();

	private Genre genre = Genre.UNKNOWN;
	//private SubGenre subGenre;
	@NotNull(message = "La canción debe tener una duración.")
	private Integer length;
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
	
	public Set<Artist> getArtists() {
		return artists;
	}

	public void setArtists(Set<Artist> artists) {
		this.artists = artists;
	}
	
	public Set<Artist> getFeaturedArtists() {
		return featuredArtists;
	}

	public void setFeaturedArtists(Set<Artist> artists) {
		this.featuredArtists = artists;
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
