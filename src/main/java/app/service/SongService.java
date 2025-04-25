package app.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import app.dto.SongDTO;
import app.dto.SongItem;
import app.enumerate.Genre;
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
		return this.songToDTO(song);
	}
	
	public List<SongDTO> songsList() {
		List<Song> songs = this.findAll();
		List<SongDTO> songsDTOs = this.songsToDTOs(songs);
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
	
	public List<SongDTO> songsToDTOs(List<Song> songs) {
		return songs.stream().map(song -> this.songToDTO(song)).toList();
	}
	
	private SongItem songToItem(Song song) {
		String fullName = "";
		List<String> artists = song.getArtistsInStrings();
		List<String> featuredArtists = song.getFeaturedArtistsInStrings();
		List<String> remixers = song.getRemixersInStrings();
		
		fullName = fullName.concat(artists.toString());
		
		if (featuredArtists.size() > 0) {
			fullName = fullName.concat(" con ");
			fullName = fullName.concat(featuredArtists.toString());
		}
		
		fullName = fullName.concat(" - ");
		fullName = fullName.concat(song.getTitle());
		
		if (remixers.size() > 0) {
			fullName = fullName.concat(" (");
			fullName = fullName.concat(remixers.toString());
			fullName = fullName.concat(" Remix)");
		}
		
		SongItem songItem = new SongItem(fullName, song.getSongId());
		return songItem;
	}
	
	public List<SongItem> songsToItems(List<Song> songs) {
		return songs.stream().map(song -> this.songToItem(song)).toList();
	}
	
	public List<Song> findByArtist(Integer artistId){
		return songRepository.findAllByArtistsArtistId(artistId);
	}
	
	public List<SongItem> songsItems() {
		List<Song> songs = this.findAll();
		return this.songsToItems(songs);
	}

	public List<SongItem> songsItemsByYear(int year) {
		LocalDate startOfYear = LocalDate.of(year, 1, 1);
		LocalDate endOfYear = LocalDate.of(year, 12, 31);
		List<Song> songs = this.songRepository.findByReleaseDateBetween(startOfYear, endOfYear);
		return this.songsToItems(songs);
	}

	public List<SongItem> songsItemsByGenre(Genre genre) {
		List<Song> songs = this.songRepository.findByGenre(genre);
		return this.songsToItems(songs);
	}
	
	public List<Song> findByArtists(List<Integer> artistId){
		return songRepository.findAllByArtistsArtistIdInOrFeaturedArtistsArtistIdInOrRemixersArtistIdIn(artistId, artistId, artistId);
	}
	
}
