package app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import app.dto.CompilationTypeDTO;
import app.dto.CountryDTO;
import app.dto.GenreDTO;
import app.enumerate.CompilationType;
import app.enumerate.Country;
import app.enumerate.Genre;

@Service
public class EnumsService {
	
	public List<GenreDTO> allGenres() {
		List<Genre> genres = Genre.getAll();
		List<GenreDTO> genresDTO = genres.stream().map(genre -> genreToDTO(genre)).toList();
		return genresDTO;
	}
	
	private GenreDTO genreToDTO(Genre genre) {
		GenreDTO genreDTO = new GenreDTO();
		genreDTO.setGenre(genre);
		genreDTO.setName(genre.getName());
		genreDTO.setHexColor(genre.getHexColor());
		return genreDTO;
	}
	
	public List<CountryDTO> allCountries() {
		List<Country> countries = Country.getAll();
		List<CountryDTO> countriesDTO = countries.stream().map(country -> countryToDTO(country)).toList();
		return countriesDTO;
	}
	
	private CountryDTO countryToDTO(Country country) {
		CountryDTO countryDTO = new CountryDTO();
		countryDTO.setGenre(country);
		countryDTO.setName(country.getName());
		countryDTO.setNombre(country.getNombre());
		return countryDTO;
	}
	
	public List<CompilationTypeDTO> allCompilationTypes() {
		List<CompilationType> compilationTypes = CompilationType.getAll();
		List<CompilationTypeDTO> compilationTypesDTO = compilationTypes.stream().map(compilationType -> compilationTypesToDTO(compilationType)).toList();
		return compilationTypesDTO;
	}
	
	private CompilationTypeDTO compilationTypesToDTO(CompilationType compilationType) {
		CompilationTypeDTO compilationTypeDTO = new CompilationTypeDTO();
		compilationTypeDTO.setCompilationType(compilationType);
		compilationTypeDTO.setTipo(compilationType.getTipo());
		compilationTypeDTO.setType(compilationType.getType());
		return compilationTypeDTO;
	}
	
}
