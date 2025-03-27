package app.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import app.dto.ArtistNameAndIdDTO;
import app.model.Artist;
import app.model.Song;
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
	
	@GetMapping("/{artistId}/songs")
	public ResponseEntity<List<Song>> allArtistSongs(@PathVariable Integer artistId) {
		List<Song> response = this.artistService.allArtistSongs(artistId);
		return ResponseEntity.ok(response);
	}
	
	@GetMapping("/byName/")
	public ResponseEntity<Artist> findByName(@RequestParam String name) {
		Artist response = this.artistService.findByName(name);
		return ResponseEntity.ok(response);
	}
	
	@GetMapping("/namesAndIds")
	public ResponseEntity<List<ArtistNameAndIdDTO>> artistsNameAndIdDTO(){
		List<ArtistNameAndIdDTO> response = this.artistService.artistsNameAndIdDTO();
		return ResponseEntity.ok(response);
	}
}