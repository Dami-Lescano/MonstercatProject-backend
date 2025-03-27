package app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.dto.SongDTO;
import app.model.Song;
import app.service.SongService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/song")
public class SongController extends GenericController<Song> {

	private SongService songService;
	
	protected SongController(SongService service) {
		super(service);
		this.songService = service;
	}
	
    @GetMapping("/info/{id}")
    public ResponseEntity<SongDTO> songInfo(@PathVariable Integer id) {
		SongDTO entity = this.songService.songInfo(id);
		
		return ResponseEntity.ok(entity);
	}
}

