package app.model;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotEmpty;

@Entity
@JsonTypeName("artistAlbum")
public class ArtistAlbum extends Album {
	@ManyToMany
	@NotEmpty(message = "Debe tener por lo menos un artista.")
	private Set<Artist> artists = new HashSet<Artist>();

	public Set<Artist> getArtists() {
		return artists;
	}

	public void setArtists(Set<Artist> artists) {
		this.artists = artists;
	}
	
	public void addArtist(Artist artist) {
		artists.add(artist);
	}
}
