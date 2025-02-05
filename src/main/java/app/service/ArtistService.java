package app.service;

import org.springframework.stereotype.Service;

import app.model.Artist;
import app.repository.ArtistRepository;

@Service
public class ArtistService extends GenericService<Artist>{

	private ArtistRepository artistRepository;
	
	public ArtistService(ArtistRepository repository) {
		super(repository);
		this.artistRepository = repository;
	}

	
}
