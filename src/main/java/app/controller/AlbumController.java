package app.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.model.Album;
import app.service.AlbumService;

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
}
