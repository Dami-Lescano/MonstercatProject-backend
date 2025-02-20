package app.service;

import org.springframework.stereotype.Service;

import app.model.Album;
import app.repository.AlbumRepository;

@Service
public class AlbumService extends GenericService<Album>{
	private AlbumRepository albumRepository;
	
	public AlbumService(AlbumRepository repository) {
		super(repository);
		this.albumRepository = repository;
	}
}
