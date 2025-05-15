package app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;

import app.model.ArtistAlbum;

public interface ArtistAlbumRepository extends GenericRepository<ArtistAlbum>{
	
	@EntityGraph(attributePaths = { "songs.artists", "songs.featuredArtists", "songs.remixers", "artists" })
	public List<ArtistAlbum> findAll();
	
	@EntityGraph(attributePaths = { "artists", "songs.artists", "songs.featuredArtists", "songs.remixers" })
	public ArtistAlbum findByAlbumId(Integer id);
}