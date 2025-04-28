package app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import app.model.CompilationAlbum;

public interface CompilationAlbumRepository extends GenericRepository<CompilationAlbum>{
	
	@EntityGraph(attributePaths = { "songs.artists", "songs.featuredArtists", "songs.remixers" })
	public List<CompilationAlbum> findAll();
	
	@EntityGraph(attributePaths = { "songs", "songs.artists", "songs.featuredArtists", "songs.remixers" })
	public CompilationAlbum findByAlbumId(Integer id);
}
