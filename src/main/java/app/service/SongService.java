package app.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import app.dto.SongDTO;
import app.dto.SongItem;
import app.enumerate.Genre;
import app.model.Converter;
import app.model.Song;
import app.repository.SongRepository;

@Service
public class SongService extends GenericService<Song>{

	private SongRepository songRepository;
	
	public SongService(SongRepository repository) {
		super(repository);
		this.songRepository = repository;
	}
	
	public List<Song> findAll() {
		return songRepository.findAll();
	}
	
	public SongDTO songInfo(Integer id) {
		Song song = songRepository.findBySongId(id);
		return Converter.songToDTO(song);
	}
	
	public List<SongDTO> songsList() {
		List<Song> songs = this.findAll();
		List<SongDTO> songsDTOs = Converter.songsToDTOs(songs);
		return songsDTOs;
	}
	
	public List<Song> findByArtist(Integer artistId){
		return songRepository.findAllByArtistsArtistId(artistId);
	}
	
	public List<SongItem> songsItems() {
		List<Song> songs = this.findAll();
		return Converter.songsToItems(songs);
	}

	public List<SongItem> songsItemsByYear(int year) {
		LocalDate startOfYear = LocalDate.of(year, 1, 1);
		LocalDate endOfYear = LocalDate.of(year, 12, 31);
		List<Song> songs = this.songRepository.findByReleaseDateBetween(startOfYear, endOfYear);
		return Converter.songsToItems(songs);
	}

	public List<SongItem> songsItemsByGenre(Genre genre) {
		List<Song> songs = this.songRepository.findByGenre(genre);
		return Converter.songsToItems(songs);
	}
	
	public List<Song> findByArtists(List<Integer> artistId){
		return songRepository.findAllByArtistsArtistIdInOrFeaturedArtistsArtistIdInOrRemixersArtistIdIn(artistId, artistId, artistId);
	}
	
}
