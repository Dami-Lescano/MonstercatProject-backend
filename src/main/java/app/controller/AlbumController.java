package app.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.dto.ArtistAlbumDTO;
import app.dto.CompilationAlbumDTO;
import app.model.Album;
import app.service.AlbumService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/album")
public class AlbumController extends GenericController<Album>{
	
	private AlbumService albumService;
	
	protected AlbumController(AlbumService service) {
		super(service);
		this.albumService = service;
	}
	
	@GetMapping("/names")
	private ResponseEntity<List<String>> albumsNames() {
		List<String> response = this.albumService.albumsNames();
		return ResponseEntity.ok(response);
	}
	
	//CompilationAlbum
	
	@GetMapping("/compilationAlbum/list")
	private ResponseEntity<List<CompilationAlbumDTO>> allCompilationAlbums() {
		List<CompilationAlbumDTO> response = this.albumService.allCompilationAlbums();
		return ResponseEntity.ok(response);
	}
	
	@GetMapping("/compilationAlbum/info/{id}")
	private ResponseEntity<CompilationAlbumDTO> compilationAlbumInfo(@PathVariable Integer id) {
		CompilationAlbumDTO response = this.albumService.compilationAlbumInfo(id);
		return ResponseEntity.ok(response);
	}
	
	//ArtistAlbum
	
	@GetMapping("/artistAlbum/list")
	private ResponseEntity<List<ArtistAlbumDTO>> allArtistAlbums() {
		List<ArtistAlbumDTO> response = this.albumService.allArtistAlbums();
		return ResponseEntity.ok(response);
	}
	
	@GetMapping("/artistAlbum/info/{id}")
	private ResponseEntity<ArtistAlbumDTO> artistAlbumInfo(@PathVariable Integer id) {
		ArtistAlbumDTO response = this.albumService.artistAlbumInfo(id);
		return ResponseEntity.ok(response);
	}
}
