package app.dto;

import java.util.List;

public class ArtistAlbumDTO {
	private Integer id;
	private String title;
	private String catalogNumber;
	private String releaseDate;
	private List<SongItem> songs;
	private String length;
	private Integer numberOfSongs;
	
	private List<ArtistItem> artists;
	private String type = "artistAlbum";

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCatalogNumber() {
		return catalogNumber;
	}

	public void setCatalogNumber(String catalogNumber) {
		this.catalogNumber = catalogNumber;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public List<SongItem> getSongs() {
		return songs;
	}

	public void setSongs(List<SongItem> songs) {
		this.songs = songs;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public Integer getNumberOfSongs() {
		return numberOfSongs;
	}

	public void setNumberOfSongs(Integer numberOfSongs) {
		this.numberOfSongs = numberOfSongs;
	}

	public List<ArtistItem> getArtists() {
		return artists;
	}

	public void setArtists(List<ArtistItem> artists) {
		this.artists = artists;
	}
	
	public String getType() {
		return type;
	}
}
