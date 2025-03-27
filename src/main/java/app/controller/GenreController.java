package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.dto.GenreDTO;
import app.service.GenreService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/genre")
public class GenreController {
	
	@Autowired
	GenreService genreService;
	
	@GetMapping
	public ResponseEntity<List<GenreDTO>> allGenres() {
		List<GenreDTO> response = genreService.allGenres();
		return ResponseEntity.ok(response);
	}
	
}
