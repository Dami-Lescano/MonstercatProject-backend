package app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.model.Song;
import app.repository.GenericRepository;
import app.repository.SongRepository;

@Service
public class SongService extends GenericService<Song>{

	//@Autowired
	private SongRepository songRepository;
	
	protected SongService(SongRepository repository) {
		super(repository);
		this.songRepository = repository;
	}
	
}
