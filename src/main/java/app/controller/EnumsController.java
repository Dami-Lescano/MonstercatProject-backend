package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.dto.CompilationTypeDTO;
import app.dto.CountryDTO;
import app.dto.GenreDTO;
import app.service.EnumsService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/enums")
public class EnumsController {
	
	@Autowired
	EnumsService genreService;
	
	@GetMapping("/genres")
	public ResponseEntity<List<GenreDTO>> allGenres() {
		List<GenreDTO> response = genreService.allGenres();
		return ResponseEntity.ok(response);
	}
	
	@GetMapping("/countries")
	public ResponseEntity<List<CountryDTO>> allCountries() {
		List<CountryDTO> response = genreService.allCountries();
		return ResponseEntity.ok(response);
	}
	
	@GetMapping("/compilationTypes")
	public ResponseEntity<List<CompilationTypeDTO>> allCompilationTypes() {
		List<CompilationTypeDTO> response = genreService.allCompilationTypes();
		return ResponseEntity.ok(response);
	}
	
}
