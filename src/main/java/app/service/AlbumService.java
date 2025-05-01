package app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.dto.ArtistAlbumDTO;
import app.dto.CompilationAlbumDTO;
import app.model.Album;
import app.model.ArtistAlbum;
import app.model.CompilationAlbum;
import app.model.Converter;
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
		return Converter.compilationAlbumToDTO(album);
	}
	
	public List<CompilationAlbumDTO> allCompilationAlbums() {
		List<CompilationAlbum> albums = compilationAlbumRepository.findAll();
		List<CompilationAlbumDTO> albumDTOs = albums.stream().map(a -> Converter.compilationAlbumToDTO(a)).toList();
		return albumDTOs;
	}
	
	//ArtistAlbum
	public ArtistAlbumDTO artistAlbumInfo(Integer id) {
		ArtistAlbum album = artistAlbumRepository.findByAlbumId(id);
		return Converter.artistAlbumToDTO(album);
	}
	
	public List<ArtistAlbumDTO> allArtistAlbums() {
		List<ArtistAlbum> albums = artistAlbumRepository.findAll();
		List<ArtistAlbumDTO> albumDTOs = albums.stream().map(a -> Converter.artistAlbumToDTO(a)).toList();
		return albumDTOs;
	}
}
