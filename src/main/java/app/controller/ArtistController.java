package app.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.model.Artist;
import app.service.ArtistService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/artist")
public class ArtistController extends GenericController<Artist> {

	private ArtistService artistService;
	
	protected ArtistController(ArtistService service) {
		super(service);
		this.artistService = service;
	}
}