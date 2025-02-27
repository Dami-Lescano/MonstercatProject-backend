package app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import app.model.Song;
import app.repository.SongRepository;

@Service
public class SongService extends GenericService<Song>{

	private SongRepository songRepository;
	
	public SongService(SongRepository repository) {
		super(repository);
		this.songRepository = repository;
	}
	
	
	public Song findById(Integer id) {
		Song song = songRepository.findBySongId(id);
		return song;
	}
	
	public List<Song> findByArtist(Integer artistId){
		return songRepository.findAllByArtistsArtistId(artistId);
	}
	
}
