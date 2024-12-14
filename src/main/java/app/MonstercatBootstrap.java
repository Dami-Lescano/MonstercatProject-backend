package app;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.builder.SongBuilder;
import app.enumerate.Genre;
import app.model.Song;
import app.service.SongService;

@Service
class MonstercatBootstrap implements InitializingBean {
	
	@Autowired
	private SongService songService;
	
	private Song flight;
	private Song dubstepKilledRockAndRoll;
	private Song words;
	
	private void initSongs() {
		
		flight = new SongBuilder()
				.withSongId(2)
				.withTitle("Flight")
				.withGenre(Genre.DRUMSTEP)
				.withLength(3, 39)
				.withReleaseDate(LocalDate.of(2013, 2, 15))
				.withCatalogNumber("MCS107")
				.buildSong();
		
		dubstepKilledRockAndRoll = new SongBuilder()
				.withSongId(1)
				.withTitle("Dubstep Killed Rock 'n' Roll")
				.withGenre(Genre.DUBSTEP)
				.withLength(4, 20)
				.withReleaseDate(LocalDate.of(2011, 7, 4))
				.withCatalogNumber(null)
				.buildSong();
		
		words = new SongBuilder()
				.withSongId(3)
				.withTitle("Words")
				.withGenre(Genre.DRUM_AND_BASS)
				.withLength(4, 36)
				.withReleaseDate(LocalDate.of(2016, 10, 26))
				.withCatalogNumber("MCS502")
				.buildSong();
		
		songService.save(dubstepKilledRockAndRoll);
		songService.save(flight);
		songService.save(words);
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		initSongs();
	}

}

/*
 * song = new SongBuilder()
				.withSongId(x)
				.withTitle(x)
				.withGenre(Genre.x)
				.withLength(x, x)
				.withReleaseDate(LocalDate.of(20xx, x, x))
				.withCatalogNumber("MC"x)
				.buildSong();
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
*/
