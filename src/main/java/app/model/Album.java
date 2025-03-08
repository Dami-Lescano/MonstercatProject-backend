package app.model;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public abstract class Album {
	
	protected static final String DATE_PATTERN = "yyyy-MM-dd";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer albumId;
	
	private String title;
	@OneToMany
	private Map<Integer, Song> songs = new HashMap<Integer, Song>();
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DATE_PATTERN)
	private LocalDate releaseDate;
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
}
