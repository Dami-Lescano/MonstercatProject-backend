package app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;

import app.model.Album;

public interface AlbumRepository extends GenericRepository<Album>{
	
	@EntityGraph(attributePaths = { "songs.artists", "songs.featuredArtists" })
	public List<Album> findAll();
	
	@EntityGraph(attributePaths = { "songs.artists", "songs.featuredArtists" })
	public Album findByAlbumId(Integer id);
}
