package app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.builder.ArtistBuilder;
import app.builder.CompilationAlbumBuilder;
import app.builder.SongBuilder;
import app.enumerate.CompilatonType;
import app.enumerate.Genre;
import app.model.Album;
import app.model.Artist;
import app.model.CompilationAlbum;
import app.model.Song;
import app.repository.AlbumRepository;
import app.repository.ArtistRepository;
import app.repository.SongRepository;

@Service
class MonstercatBootstrap implements InitializingBean {
	
	@Autowired
	private SongRepository songRepository;
	
	@Autowired
	private ArtistRepository artistRepository;
	
	@Autowired
	private AlbumRepository albumRepository;
	
	//Songs list
	private Set<Song> songs;
	
	//Artists list
	private Set<Artist> artists;
	
	//Compilatons list
	private Set<CompilationAlbum> compilationAlbums;
	
	//Artists
	private Artist ephixa;
	private Artist haloNova;
	private Artist stephenWalking;
	private Artist arion;
	private Artist goingQuantum;
	private Artist feint;
	private Artist neilio;
	
	//Songs
	
	//001 - Launch Week
	private Song dubstepKilledRockAndRoll;
	private Song theForce;
	private Song stillWalking;
	private Song coldBloodAndIceCreamCones;
	private Song hello;
	private Song atlas;
	private Song captivating;
	
	//Monstercat Compilations
	private CompilationAlbum launchWeek;
	
	/*future songs
	private Song flight;
	private Song words;
	*/
	
	private void initArtists() {
		
		artists = new HashSet<Artist>();
		
		ephixa = new ArtistBuilder()
				.withArtistName("Ephixa")
				.withRealName(new ArrayList<String>(Arrays.asList("James Aurthur Leusink")))
				.withBirthDate(LocalDate.of(1990, 4, 13))
				.withCountry("Canadá")
				.withInitYear("2008")
				.build();
		artists.add(ephixa);
		
		haloNova = new ArtistBuilder()
				.withArtistName("Halo Nova")
				.withRealName(new ArrayList<String>(Arrays.asList("Nikki Kaelar")))
				.withBirthDate(LocalDate.of(1990, 5, 15))
				.withCountry("Estados Unidos")
				.withInitYear("2011")
				.build();
		artists.add(haloNova);
		
		stephenWalking = new ArtistBuilder()
				.withArtistName("Stephen Walking")
				.withRealName(new ArrayList<String>(Arrays.asList("Michael Arthur Toope")))
				.withCountry("Canadá")
				.withInitYear("2010")
				.build();
		artists.add(stephenWalking);
		
		arion = new ArtistBuilder()
				.withArtistName("Arion")
				.withRealName(new ArrayList<String>(Arrays.asList("Arion Alijah Anderson")))
				.withInitYear("2009")
				.build();
		artists.add(arion);
		
		goingQuantum = new ArtistBuilder()
				.withArtistName("Going Quantum")
				.withRealName(new ArrayList<String>(Arrays.asList("Jonathan Winter")))
				.withCountry("Canadá")
				.withInitYear("2011")
				.build();
		artists.add(goingQuantum);
		
		feint = new ArtistBuilder()
				.withArtistName("Feint")
				.withRealName(new ArrayList<String>(Arrays.asList("Andrew Hu")))
				.withCountry("Reino Unido")
				.withInitYear("2011")
				.build();
		artists.add(feint);
		
		neilio = new ArtistBuilder()
				.withArtistName("Neilio")
				.withRealName(new ArrayList<String>(Arrays.asList("Neil Patrick Burke")))
				.withCountry("Irlanda")
				.withInitYear("2011")
				.build();
		artists.add(neilio);
		
		artistRepository.saveAll(artists);
		
		/*artistRepository.save(ephixa);
		artistRepository.save(feint);*/
		
		/*
		artist = new ArtistBuilder()
				.withArtistName("x")
				.withRealName(new ArrayList<String>(Arrays.asList("x")))
				.withBirthDate(LocalDate.of(x, x, x))
				.withCountry("x")
				.withInitYear("x")
				.withEndYear("x")
				.build();
		artists.add(x);
		 */
	}
	
	private void initSongs() {
		
		/*
		song = new SongBuilder()
				.withTitle(x)
				.withArtists(new HashSet<Artist>(Arrays.asList(x...)))
				.withGenre(Genre.x)
				.withLength(x, x)
				.withReleaseDate(LocalDate.of(20xx, x, x))
				.withCatalogNumber("MC"x)
				.buildSong();
		songs.add(x);
		*/
		
		songs = new HashSet<Song>();
		
		dubstepKilledRockAndRoll = new SongBuilder()
				.withTitle("Dubstep Killed Rock 'n' Roll")
				.withArtists(new HashSet<Artist>(Arrays.asList(ephixa)))
				.withGenre(Genre.DUBSTEP)
				.withLength(4, 20)
				.withReleaseDate(LocalDate.of(2011, 7, 4))
				.withCatalogNumber(null)
				.buildSong();
		songs.add(dubstepKilledRockAndRoll);
		
		theForce = new SongBuilder()
				.withTitle("The Force")
				.withArtists(new HashSet<Artist>(Arrays.asList(haloNova)))
				.withGenre(Genre.DUBSTEP)
				.withLength(3, 26)
				.withReleaseDate(LocalDate.of(2011, 7, 5))
				.buildSong();
		songs.add(theForce);
		
		stillWalking = new SongBuilder()
				.withTitle("Still Walking")
				.withArtists(new HashSet<Artist>(Arrays.asList(stephenWalking)))
				.withGenre(Genre.DUBSTEP)
				.withLength(3, 21)
				.withReleaseDate(LocalDate.of(2011, 7, 6))
				.buildSong();
		songs.add(stillWalking);
		
		coldBloodAndIceCreamCones = new SongBuilder()
				.withTitle("Cold Blood & Ice Cream Cones")
				.withArtists(new HashSet<Artist>(Arrays.asList(arion)))
				.withGenre(Genre.ELECTRO)
				.withLength(4, 20)
				.withReleaseDate(LocalDate.of(2011, 7, 7))
				.buildSong();
		songs.add(coldBloodAndIceCreamCones);
		
		hello = new SongBuilder()
				.withTitle("Hello?")
				.withArtists(new HashSet<Artist>(Arrays.asList(goingQuantum)))
				.withGenre(Genre.DUBSTEP)
				.withLength(6, 1)
				.withReleaseDate(LocalDate.of(2011, 7, 8))
				.buildSong();
		songs.add(hello);
		
		atlas = new SongBuilder()
				.withTitle("Atlas")
				.withArtists(new HashSet<Artist>(Arrays.asList(feint)))
				.withGenre(Genre.DRUM_AND_BASS)
				.withLength(4, 48)
				.withReleaseDate(LocalDate.of(2011, 7, 9))
				.buildSong();
		songs.add(atlas);
		
		captivating = new SongBuilder()
				.withTitle("Captivating")
				.withArtists(new HashSet<Artist>(Arrays.asList(neilio)))
				.withGenre(Genre.HARD_DANCE)
				.withLength(5, 24)
				.withReleaseDate(LocalDate.of(2011, 7, 10))
				.buildSong();
		songs.add(captivating);
		
		songRepository.saveAll(songs);
		
		/*songRepository.save(dubstepKilledRockAndRoll);
		songRepository.save(flight);
		songRepository.save(words);*/
	}
	
	private void initMonstercatAlbums() {
		compilationAlbums = new HashSet<CompilationAlbum>();
		
		launchWeek = new CompilationAlbumBuilder()
				.withTitle("Launch Week")
				.withSongs(new HashSet<Song>(Arrays.asList(
						coldBloodAndIceCreamCones,
						atlas,
						dubstepKilledRockAndRoll,
						hello,
						theForce,
						captivating,
						stillWalking
					)))
				.withReleaseDate(LocalDate.of(2011, 7, 12))
				.withCompilationType(CompilatonType.MONSTERCAT_COMPILATION)
				.withCatalogNumber("MC001")
				.build();
		compilationAlbums.add(launchWeek);
		
		albumRepository.saveAll(compilationAlbums);
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		initArtists();
		initSongs();
		initMonstercatAlbums();
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
	songs.add(x);
				
	artist = new ArtistBuilder()
				.withArtistName("x")
				.withRealName(new ArrayList<String>(Arrays.asList("x")))
				.withBirthDate(LocalDate.of(x, x, x))
				.withCountry("x")
				.withInitYear("x")
				.withEndYear("x")
				.build();
				
	future artists
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
				
	lauraBrehm = new ArtistBuilder()
				.withArtistName("Laura Brehm")
				.withRealName(new ArrayList<String>(Arrays.asList("Laura Karen Brehm")))
				.withBirthDate(LocalDate.of(1990, 8, 15))
				.withCountry("Estados Unidos")
				.withInitYear("2006")
				.build();	
 * 
 * 
 	future songs
 	flight = new SongBuilder()
				.withTitle("Flight")
				.withArtists(new HashSet<Artist>(Arrays.asList(tristam, braken)))
				.withGenre(Genre.DRUMSTEP)
				.withLength(3, 39)
				.withReleaseDate(LocalDate.of(2013, 2, 15))
				.withCatalogNumber("MCS107")
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
