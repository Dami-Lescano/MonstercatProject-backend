package app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.dto.AlbumDTO;
import app.model.Album;
import app.model.Song;
import app.repository.AlbumRepository;

@Service
public class AlbumService extends GenericService<Album>{
	private AlbumRepository albumRepository;
	
	@Autowired
	private SongService songService;
	
	public AlbumService(AlbumRepository repository) {
		super(repository);
		this.albumRepository = repository;
	}
	
	public AlbumDTO albumInfo(Integer id) {
		Album album = albumRepository.findByAlbumId(id);
		return this.albumToDTO(album);
	}

	public List<String> albumsNames() {
		List<Album> albums = albumRepository.findAll();
		List<String> names = albums.stream().map(a -> a.getTitle()).toList();
		return names;
	}
	
	private AlbumDTO albumToDTO(Album album) {
		AlbumDTO albumDTO = new AlbumDTO();
		albumDTO.setId(album.getAlbumId());
		albumDTO.setTitle(album.getTitle());
		albumDTO.setReleaseDate(album.getReleaseDateInString());
		albumDTO.setCatalogNumber(album.getCatalogNumber());
		albumDTO.setLength(album.getLength());
		albumDTO.setNumberOfSongs(album.getNumberOfSongs());
		List<Song> songs = album.getSongs().values().stream().toList();
		albumDTO.setSongs(this.songService.songsToItems(songs));
		
		return albumDTO;
	}
	
	public List<AlbumDTO> allAlbums() {
		List<Album> albums = albumRepository.findAll();
		List<AlbumDTO> albumDTOs = albums.stream().map(a -> this.albumToDTO(a)).toList();
		return albumDTOs;
	}
}
