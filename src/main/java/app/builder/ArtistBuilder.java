package app.builder;

import java.time.LocalDate;
import java.util.List;

import app.enumerate.Country;
import app.model.Artist;

public class ArtistBuilder {
	
	private Artist artist;
	
	public ArtistBuilder() {
		this.artist = new Artist();
	}
	
	public ArtistBuilder withArtistId(Integer artistId) {
		this.artist.setArtistId(artistId);
		return this;
	}
	
	public ArtistBuilder withArtistName(String artistName) {
		this.artist.setArtistName(artistName);
		return this;
	}
	
	public ArtistBuilder withRealName(List<String> realName) {
		this.artist.setRealName(realName);
		return this;
	}
	
	public ArtistBuilder withCountry(Country country) {
		this.artist.setCountry(country);
		return this;
	}
	
	public ArtistBuilder withBirthDate(LocalDate birthDate) {
		this.artist.setBirthDate(birthDate);
		return this;
	}
	
	public ArtistBuilder withEndYear(Integer endYear) {
		this.artist.setEndYear(endYear);
		return this;
	}
	
	public ArtistBuilder withInitYear(Integer initYear) {
		this.artist.setInitYear(initYear);
		return this;
	}
	
	public Artist build() {
		return this.artist;
	}
	
}
