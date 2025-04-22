package app.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = ArtistAlbum.class, name = "artistAlbum"),
	@JsonSubTypes.Type(value = CompilationAlbum.class, name = "compilationAlbum")
})
@Entity
public abstract class Album {
	
	protected static final String DATE_PATTERN = "yyyy-MM-dd";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer albumId;
	
	@NotBlank(message = "El álbum debe tener un título.")
	private String title;
	
	//TODO: Investigar porque OneToMany se rompe cuando se quiere guardar una cancion con un mismo artista de cualquier tipo que otra cancion
	//Por ejemplo: si el artista de una cancion ya existente es Ephixa y quiero guardar otra cancion de Ephixa se rompe
	
	@ManyToAny
	@Size(min = 2, message = "El álbum be tener por lo menos dos canciones.")
	private Map<Integer, Song> songs = new HashMap<Integer, Song>();
	
	@NotNull(message = "El álbum debe tener una fecha de lanzamiento")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DATE_PATTERN)
	private LocalDate releaseDate;
	
	@NotBlank(message = "El álbum debe tener un título.")
	private String catalogNumber;
	
	public Integer getAlbumId() {
		return albumId;
	}
	public void setAlbumId(Integer albumId) {
		this.albumId = albumId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Map<Integer, Song> getSongs() {
		return songs;
	}
	public void setSongs(Map<Integer, Song> songs) {
		this.songs = songs;
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getCatalogNumber() {
		return catalogNumber;
	}
	public void setCatalogNumber(String catalogNumber) {
		this.catalogNumber = catalogNumber;
	}
	
	public void addSong(Song newSong) {
		var position = this.songs.size() + 1;
		songs.put(position, newSong);
	}
	
	public String getLength() {
		int lengthSum = this.songs.values().stream().mapToInt(s -> s.getLength()).sum();
		return Converter.intToLength(lengthSum);
	}
	
	public int getNumberOfSongs() {
		var count = this.songs.size();
		return count;
	}
	
	public String getReleaseDateInString() {
		return this.releaseDate.format(DateTimeFormatter.ofPattern(DATE_PATTERN));
	}
}
