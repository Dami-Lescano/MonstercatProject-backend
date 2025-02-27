package app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.model.Artist;
import app.model.Song;
import app.repository.ArtistRepository;

@Service
public class ArtistService extends GenericService<Artist>{

	private ArtistRepository artistRepository;
	
	@Autowired
	private SongService songService;
	
	public ArtistService(ArtistRepository repository) {
		super(repository);
		this.artistRepository = repository;
	}

	public List<Song> allArtistSongs(Integer artistId){
		return songService.findByArtist(artistId);
	}

	public Artist findByName(String name) {
		return artistRepository.findByArtistName(name);
	}
	
}
