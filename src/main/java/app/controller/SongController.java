package app.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.dto.SongDTO;
import app.dto.SongItem;
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
    
    @GetMapping("/songsList")
    public ResponseEntity<List<SongDTO>> songsList(){
    	List<SongDTO> response = this.songService.songsList();
    	return ResponseEntity.ok(response);
    }
    
    @GetMapping("/songsItems")
    public ResponseEntity<List<SongItem>> songsItems(){
    	List<SongItem> response = this.songService.songsItems();
    	return ResponseEntity.ok(response);
    }
}

