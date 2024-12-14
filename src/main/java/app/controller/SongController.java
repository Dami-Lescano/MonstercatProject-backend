package app.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.model.Song;
import app.service.SongService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/song")
public class SongController extends GenericController<Song> {

	private SongService consumerService;
	
	protected SongController(SongService service) {
		super(service);
		this.consumerService = service;
	}
}

