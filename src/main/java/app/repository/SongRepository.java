package app.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.stereotype.Repository;

import app.enumerate.Genre;
import app.model.Song;

@Repository
public interface SongRepository extends GenericRepository<Song> {
	
	@EntityGraph(attributePaths = { "artists.artistName", "featuredArtists.artistName", "remixers.artistName" })
	public Song findBySongId(Integer id);
	
	@EntityGraph(attributePaths = { "artists", "featuredArtists", "remixers" })
	public List<Song> findAll();
	
	@EntityGraph(attributePaths = { "artists", "featuredArtists", "remixers" })
	public List<Song> findAllByArtistsArtistId(Integer artistId);
	
	@EntityGraph(attributePaths = { "artists", "featuredArtists", "remixers" })
	public List<Song> findAllByFeaturedArtistsArtistId(Integer artistId);

	@EntityGraph(attributePaths = { "artists.artistName", "featuredArtists.artistName", "remixers.artistName" })
	public List<Song> findByReleaseDateBetween(LocalDate startDate, LocalDate endDate);
	
	@EntityGraph(attributePaths = { "artists.artistName", "featuredArtists.artistName", "remixers.artistName" })
	public List<Song> findByGenre(Genre genre);
}