package app.dto;

import java.time.LocalDate;
import java.util.List;

import app.enumerate.Genre;

public class SongFiltersDTO {
	
	private String title;
	private List<Integer> artistsId;
	private List<Integer> featuredArtistsId;
	private List<Integer> remixersId;
	private List<Genre> genres;
	private Integer minLength;
	private Integer maxLength;
	private LocalDate minDate;
	private LocalDate maxDate;
	private String catalogNumber;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Integer> getArtistsId() {
		return artistsId;
	}
	public void setArtistsId(List<Integer> artistsId) {
		this.artistsId = artistsId;
	}
	public List<Integer> getFeaturedArtistsId() {
		return featuredArtistsId;
	}
	public void setFeaturedArtistsId(List<Integer> featuredArtistsId) {
		this.featuredArtistsId = featuredArtistsId;
	}
	public List<Integer> getRemixersId() {
		return remixersId;
	}
	public void setRemixersId(List<Integer> remixersId) {
		this.remixersId = remixersId;
	}
	public List<Genre> getGenres() {
		return genres;
	}
	public void setGenres(List<Genre> genres) {
		this.genres = genres;
	}
	public Integer getMinLength() {
		return minLength;
	}
	public void setMinLength(Integer minLength) {
		this.minLength = minLength;
	}
	public Integer getMaxLength() {
		return maxLength;
	}
	public void setMaxLength(Integer maxLength) {
		this.maxLength = maxLength;
	}
	public LocalDate getMinDate() {
		return minDate;
	}
	public void setMinDate(LocalDate minDate) {
		this.minDate = minDate;
	}
	public LocalDate getMaxDate() {
		return maxDate;
	}
	public void setMaxDate(LocalDate maxDate) {
		this.maxDate = maxDate;
	}
	public String getCatalogNumber() {
		return catalogNumber;
	}
	public void setCatalogNumber(String catalogNumber) {
		this.catalogNumber = catalogNumber;
	}
}
