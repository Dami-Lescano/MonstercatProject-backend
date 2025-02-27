package app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.stereotype.Repository;

import app.model.Song;

@Repository
public interface SongRepository extends GenericRepository<Song> {
	
	@EntityGraph(attributePaths = { "artists", "featuredArtists" })
	public Song findBySongId(Integer id);
	
	@EntityGraph(attributePaths = { "artists", "featuredArtists" })
	public List<Song> findAll();
	
	@EntityGraph(attributePaths = { "artists", "featuredArtists" })
	public List<Song> findAllByArtistsArtistId(Integer artistId);
	
	@EntityGraph(attributePaths = { "artists", "featuredArtists" })
	public List<Song> findAllByFeaturedArtistsArtistId(Integer artistId);
}