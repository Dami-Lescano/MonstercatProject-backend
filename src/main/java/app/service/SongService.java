package app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import app.dto.SongDTO;
import app.model.Song;
import app.repository.SongRepository;

@Service
public class SongService extends GenericService<Song>{

	private SongRepository songRepository;
	
	public SongService(SongRepository repository) {
		super(repository);
		this.songRepository = repository;
	}
	
	
	public SongDTO songInfo(Integer id) {
		Song song = songRepository.findBySongId(id);
		return this.songToDTO(song);
	}
	
	public List<SongDTO> songsList() {
		List<Song> songs = songRepository.findAll();
		List<SongDTO> songsDTOs = songs.stream().map(song -> this.songToDTO(song)).toList();
		return songsDTOs;
	}
	
	private SongDTO songToDTO(Song song) {
		SongDTO songDTO = new SongDTO();
		songDTO.setSongId(song.getSongId());
		songDTO.setTitle(song.getTitle());
		songDTO.setLength(song.getLengthInString());
		songDTO.setCatalogNumber(song.getCatalogNumber());
		songDTO.setGenre(song.getGenre().getName());
		songDTO.setReleaseDate(song.getReleaseDateInString());
		songDTO.setArtists(song.getArtistsInStrings());
		songDTO.setFeaturedArtists(song.getFeaturedArtistsInStrings());
		songDTO.setRemixers(song.getRemixersInStrings());
		return songDTO;
	}
	
	public List<Song> findByArtist(Integer artistId){
		return songRepository.findAllByArtistsArtistId(artistId);
	}
	
}
