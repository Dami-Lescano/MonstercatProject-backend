package app.repository;

import org.springframework.stereotype.Repository;

import app.model.Artist;

@Repository
public interface ArtistRepository extends GenericRepository<Artist> {

	public Artist findByArtistName(String name);

}