package app.service;

import java.util.List;

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
	
	public Album findById(Integer id) {
		Album album = albumRepository.findByAlbumId(id);
		return album;
	}

	public List<String> albumsNames() {
		List<Album> albums = albumRepository.findAll();
		List<String> names = albums.stream().map(a -> a.getTitle()).toList();
		return names;
	}
}
