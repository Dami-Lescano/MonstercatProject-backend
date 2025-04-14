package app.dto;

public class ArtistItem {
	private String artistName;
	private Integer artistId;

	public ArtistItem(String name, Integer id) {
		this.artistId = id;
		this.artistName = name;
	}
	
	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public Integer getArtistId() {
		return artistId;
	}

	public void setArtistId(Integer artistId) {
		this.artistId = artistId;
	}
}