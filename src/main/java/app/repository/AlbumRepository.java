package app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;

import app.model.Album;

public interface AlbumRepository extends GenericRepository<Album> {
	
	@EntityGraph(attributePaths = { "songs"})
	public List<Album> findAll();
	
}
