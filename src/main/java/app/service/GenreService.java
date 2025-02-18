package app.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import app.dto.GenreDTO;
import app.enumerate.Genre;

@Service
public class GenreService {
	
	public List<GenreDTO> allGenres() {
		List<Genre> genres = Genre.getAll();
		List<GenreDTO> genresDTO = genres.stream().map(genre -> genreToDTO(genre)).collect(Collectors.toList());
		return genresDTO;
	}
	
	private GenreDTO genreToDTO(Genre genre) {
		GenreDTO genreDTO = new GenreDTO();
		genreDTO.setGenre(genre);
		genreDTO.setName(genre.getName());
		genreDTO.setHexColor(genre.getHexColor());
		return genreDTO;
	}
	
}
