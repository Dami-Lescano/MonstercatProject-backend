package app.controller;

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
}
