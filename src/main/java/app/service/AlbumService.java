package app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.dto.ArtistAlbumDTO;
import app.dto.ArtistItem;
import app.dto.CompilationAlbumDTO;
import app.model.Album;
import app.model.ArtistAlbum;
import app.model.CompilationAlbum;
import app.model.Song;
import app.repository.AlbumRepository;
import app.repository.ArtistAlbumRepository;
import app.repository.CompilationAlbumRepository;

@Service
public class AlbumService extends GenericService<Album>{
	private AlbumRepository albumRepository;
	
	@Autowired
	private CompilationAlbumRepository compilationAlbumRepository;
	@Autowired
	private ArtistAlbumRepository artistAlbumRepository;
	
	@Autowired
	private ArtistService artistService;
	@Autowired
	private SongService songService;
	
	public AlbumService(AlbumRepository repository) {
		super(repository);
		this.albumRepository = repository;
	}

	public List<String> albumsNames() {
		List<Album> albums = albumRepository.findAll();
		List<String> names = albums.stream().map(a -> a.getTitle()).toList();
		return names;
	}
	
	//CompilationAlbum
	
	public CompilationAlbumDTO compilationAlbumInfo(Integer id) {
		CompilationAlbum album = compilationAlbumRepository.findByAlbumId(id);
		return this.compilationAlbumToDTO(album);
	}
	
	private CompilationAlbumDTO compilationAlbumToDTO(CompilationAlbum album) {
		CompilationAlbumDTO albumDTO = new CompilationAlbumDTO();
		albumDTO.setId(album.getAlbumId());
		albumDTO.setTitle(album.getTitle());
		albumDTO.setReleaseDate(album.getReleaseDateInString());
		albumDTO.setCatalogNumber(album.getCatalogNumber());
		albumDTO.setLength(album.getLength());
		albumDTO.setNumberOfSongs(album.getNumberOfSongs());
		List<Song> songs = album.getSongs().values().stream().toList();
		albumDTO.setSongs(this.songService.songsToItems(songs));
		albumDTO.setCompilationType(album.getCompilationType());
		
		return albumDTO;
	}
	
	public List<CompilationAlbumDTO> allCompilationAlbums() {
		List<CompilationAlbum> albums = compilationAlbumRepository.findAll();
		List<CompilationAlbumDTO> albumDTOs = albums.stream().map(a -> this.compilationAlbumToDTO(a)).toList();
		return albumDTOs;
	}
	
	//ArtistAlbum
	public ArtistAlbumDTO artistAlbumInfo(Integer id) {
		ArtistAlbum album = artistAlbumRepository.findByAlbumId(id);
		return this.artistAlbumToDTO(album);
	}
	
	private ArtistAlbumDTO artistAlbumToDTO(ArtistAlbum album) {
		ArtistAlbumDTO albumDTO = new ArtistAlbumDTO();
		albumDTO.setId(album.getAlbumId());
		albumDTO.setTitle(album.getTitle());
		albumDTO.setReleaseDate(album.getReleaseDateInString());
		albumDTO.setCatalogNumber(album.getCatalogNumber());
		albumDTO.setLength(album.getLength());
		albumDTO.setNumberOfSongs(album.getNumberOfSongs());
		List<Song> songs = album.getSongs().values().stream().toList();
		albumDTO.setSongs(this.songService.songsToItems(songs));
		List<ArtistItem> artists = this.artistService.artistsToItems(album.getArtists().stream().toList());
		albumDTO.setArtists(artists);
		
		return albumDTO;
	}
	
	public List<ArtistAlbumDTO> allArtistAlbums() {
		List<ArtistAlbum> albums = artistAlbumRepository.findAll();
		List<ArtistAlbumDTO> albumDTOs = albums.stream().map(a -> this.artistAlbumToDTO(a)).toList();
		return albumDTOs;
	}
}
