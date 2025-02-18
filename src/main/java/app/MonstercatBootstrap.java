package app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.builder.ArtistBuilder;
import app.builder.SongBuilder;
import app.enumerate.Genre;
import app.model.Artist;
import app.model.Song;
import app.repository.ArtistRepository;
import app.repository.SongRepository;

@Service
class MonstercatBootstrap implements InitializingBean {
	
	@Autowired
	private SongRepository songRepository;
	
	@Autowired
	private ArtistRepository artistRepository;
	
	//Artists
	private Artist tristam;
	private Artist braken;
	private Artist ephixa;
	private Artist feint;
	private Artist lauraBrehm;
	
	//Songs
	private Song flight;
	private Song dubstepKilledRockAndRoll;
	private Song words;
	
	private void initArtists() {
		tristam = new ArtistBuilder()
				.withArtistName("Tristam")
				.withRealName(new ArrayList<String>(Arrays.asList("Leandre Bérubé Bergeron")))
				.withBirthDate(LocalDate.of(1995, 2, 26))
				.withCountry("Canadá")
				.withInitYear("2008")
				.withEndYear("2021")
				.build();
		
		braken = new ArtistBuilder()
				.withArtistName("Braken")
				.withRealName(new ArrayList<String>(Arrays.asList("George Rakushkin")))
				.withInitYear("2013")
				.build();
		
		ephixa = new ArtistBuilder()
				.withArtistName("Ephixa")
				.withRealName(new ArrayList<String>(Arrays.asList("James Aurthur Leusink")))
				.withBirthDate(LocalDate.of(1990, 4, 13))
				.withCountry("Canadá")
				.withInitYear("2008")
				.build();
		
		feint = new ArtistBuilder()
				.withArtistName("Feint")
				.withRealName(new ArrayList<String>(Arrays.asList("Andrew Hu")))
				.withCountry("Reino Unido")
				.withInitYear("2011")
				.build();
		
		lauraBrehm = new ArtistBuilder()
				.withArtistName("Laura Brehm")
				.withRealName(new ArrayList<String>(Arrays.asList("Laura Karen Brehm")))
				.withBirthDate(LocalDate.of(1990, 8, 15))
				.withCountry("Estados Unidos")
				.withInitYear("2006")
				.build();
		
		artistRepository.save(tristam);
		artistRepository.save(braken);
		artistRepository.save(ephixa);
		artistRepository.save(feint);
		artistRepository.save(lauraBrehm);
	}
	
	private void initSongs() {
		
		flight = new SongBuilder()
				.withTitle("Flight")
				.withArtists(new HashSet<Artist>(Arrays.asList(tristam, braken)))
				.withGenre(Genre.DRUMSTEP)
				.withLength(3, 39)
				.withReleaseDate(LocalDate.of(2013, 2, 15))
				.withCatalogNumber("MCS107")
				.buildSong();
		
		dubstepKilledRockAndRoll = new SongBuilder()
				.withTitle("Dubstep Killed Rock 'n' Roll")
				.withArtists(new HashSet<Artist>(Arrays.asList(ephixa)))
				.withGenre(Genre.DUBSTEP)
				.withLength(4, 20)
				.withReleaseDate(LocalDate.of(2011, 7, 4))
				.withCatalogNumber(null)
				.buildSong();
		
		words = new SongBuilder()
				.withTitle("Words")
				.withArtists(new HashSet<Artist>(Arrays.asList(feint)))
				.withFeaturedArtists(new HashSet<Artist>(Arrays.asList(lauraBrehm)))
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
		initArtists();
		initSongs();
	}

}

/*
 * song = new SongBuilder()
				.withSongId(x)
				.withTitle(x)
				.withArtists(new HashSet<Artist>(Arrays.asList(x...)))
				.withGenre(Genre.x)
				.withLength(x, x)
				.withReleaseDate(LocalDate.of(20xx, x, x))
				.withCatalogNumber("MC"x)
				.buildSong();
				
	artist = new ArtistBuilder()
				.withArtistName("x")
				.withRealName(new ArrayList<String>(Arrays.asList("x")))
				.withBirthDate(LocalDate.of(x, x, x))
				.withCountry("x")
				.withInitYear("x")
				.withEndYear("x")
				.build();
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
