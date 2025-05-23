package app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.dto.ArtistItem;
import app.dto.SongDTO;
import app.dto.SongItem;
import app.model.Artist;
import app.model.Converter;
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

	public List<SongDTO> allArtistSongs(Integer artistId){
		List<Song> songs = songService.findByArtist(artistId);
		return Converter.songsToDTOs(songs);
	}

	public Artist findByName(String name) {
		return artistRepository.findByArtistName(name);
	}

	public List<ArtistItem> artistsNameAndIdDTO() {
		List<Artist> artists = this.artistRepository.findAllByOrderByArtistNameAsc();
		List<ArtistItem> artistsDTO = Converter.artistsToItems(artists);
		return artistsDTO;
	}

	public List<SongItem> allArtistsSongs(List<Integer> artistId){
		List<Song> songs = songService.findByArtists(artistId);
		return Converter.songsToItems(songs);
	}
	
}
