package app;

import java.time.LocalDate;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.builder.SongBuilder;
import app.enumerate.Genre;
import app.model.Song;
import app.repository.SongRepository;

@Service
class MonstercatBootstrap implements InitializingBean {
	
	@Autowired
	private SongRepository songRepository;
	
	private Song flight;
	private Song dubstepKilledRockAndRoll;
	private Song words;
	
	private void initSongs() {
		
		System.out.println("Bootstrap");
		
		flight = new SongBuilder()
				.withTitle("Flight")
				.withGenre(Genre.DRUMSTEP)
				.withLength(3, 39)
				.withReleaseDate(LocalDate.of(2013, 2, 15))
				.withCatalogNumber("MCS107")
				.buildSong();
		
		dubstepKilledRockAndRoll = new SongBuilder()
				.withTitle("Dubstep Killed Rock 'n' Roll")
				.withGenre(Genre.DUBSTEP)
				.withLength(4, 20)
				.withReleaseDate(LocalDate.of(2011, 7, 4))
				.withCatalogNumber(null)
				.buildSong();
		
		words = new SongBuilder()
				.withTitle("Words")
				.withGenre(Genre.DRUM_AND_BASS)
				.withLength(4, 36)
				.withReleaseDate(LocalDate.of(2016, 10, 26))
				.withCatalogNumber("MCS502")
				.buildSong();
		
		songRepository.save(dubstepKilledRockAndRoll);
		songRepository.save(flight);
		songRepository.save(words);
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
