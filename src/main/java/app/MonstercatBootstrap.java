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
	
	//Artists          private Artist x;
	private Artist ephixa;
	private Artist haloNova;
	private Artist stephenWalking;
	private Artist arion;
	private Artist goingQuantum;
	private Artist feint;
	private Artist neilio;
	
	private Artist fiveteenGrams;
	private Artist eminence;
	private Artist matduke;
	private Artist noisestorm;
	private Artist obsidia;
	private Artist projectFortySix;
	private Artist twoThirds;
	private Artist matthewSartori;
	
	//Songs		private Song x;
	
	//001 - Launch Week
	private Song dubstepKilledRockAndRoll;
	private Song theForce;
	private Song stillWalking;
	private Song coldBloodAndIceCreamCones;
	private Song hello;
	private Song atlas;
	private Song captivating;
	
	//002 - Early Stage
	private Song someWobbles;
	private Song blowExxxplode;
	private Song dreaming;
	private Song lost;
	private Song anotherWorld;
	private Song weMove;
	private Song tanpopo;
	private Song totallyRadical;
	private Song metropolis;
	private Song airwaves;
	private Song obsession;
	private Song rockTheHouse;
	private Song lightPollution;
	private Song triceracops;
	private Song theBassex;
	
	//Monstercat Compilations		private CompilationAlbum x;
	private CompilationAlbum launchWeek;
	private CompilationAlbum earlyStage;
	
	/*future songs
	private Song flight;
	private Song words;
	*/
	
	private void initArtists() {
		
		artists = new HashSet<Artist>();
		
		//001 - Launch Week
		
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
		
		//002 - Early Stage
		
		fiveteenGrams = new ArtistBuilder()
				.withArtistName("15grams")
				.withRealName(new ArrayList<String>(Arrays.asList("Brendan Mosca")))
				.withCountry("Australia")
				.build();
		artists.add(fiveteenGrams);
		
		eminence = new ArtistBuilder()
				.withArtistName("Eminence")
				.withRealName(new ArrayList<String>(Arrays.asList("Mathew William Kenneth Kazmierowski", "Dillon Jun Ho Wong")))
				.withCountry("Canadá")
				.withInitYear("2010")
				.build();
		artists.add(eminence);
		
		matduke = new ArtistBuilder()
				.withArtistName("Matduke")
				.withRealName(new ArrayList<String>(Arrays.asList("Mathieu Giguère")))
				.withCountry("Canadá")
				.withInitYear("2008")
				.build();
		artists.add(matduke);
		
		noisestorm = new ArtistBuilder()
				.withArtistName("Noisestorm")
				.withRealName(new ArrayList<String>(Arrays.asList("Eoin Marc O' Broin")))
				.withCountry("Irlanda")
				.withInitYear("2010")
				.build();
		artists.add(noisestorm);
		
		obsidia = new ArtistBuilder()
				.withArtistName("Obsidia")
				.withRealName(new ArrayList<String>(Arrays.asList("Domenic Ganley")))
				.withCountry("Reino Unido")
				.withInitYear("2010")
				.build();
		artists.add(obsidia);
		
		projectFortySix = new ArtistBuilder()
				.withArtistName("Project 46")
				.withRealName(new ArrayList<String>(Arrays.asList("Thomas Edward Shaw", "Ryan Leonard Henderson")))
				.withCountry("Canadá")
				.withInitYear("2011")
				.build();
		artists.add(projectFortySix);
		
		twoThirds = new ArtistBuilder()
				.withArtistName("TwoThirds")
				.withRealName(new ArrayList<String>(Arrays.asList("Lewis Michael Dransfield")))
				.withBirthDate(LocalDate.of(1993, 9, 13))
				.withCountry("Reino Unido")
				.withInitYear("2009")
				.build();
		artists.add(twoThirds);
		
		matthewSartori = new ArtistBuilder()
				.withArtistName("Matthew Sartori")
				.withRealName(new ArrayList<String>(Arrays.asList("Matthew Sartori")))
				.withCountry("Canadá")
				.build();
		artists.add(matthewSartori);
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
		
		artistRepository.saveAll(artists);
	}
	
	private void initSongs() {
		
		songs = new HashSet<Song>();
		
		//001 - Launch Week
		
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
		
		//002 - Early Stage
		
		someWobbles = new SongBuilder()
				.withTitle("Some Wobbles")
				.withArtists(new HashSet<Artist>(Arrays.asList(ephixa)))
				.withGenre(Genre.DUBSTEP)
				.withLength(5, 15)
				.withReleaseDate(LocalDate.of(2011, 7, 29))
				.buildSong();
		songs.add(someWobbles);
		
		blowExxxplode = new SongBuilder()
				.withTitle("Blow ExXxplode")
				.withArtists(new HashSet<Artist>(Arrays.asList(arion)))
				.withGenre(Genre.ELECTRO)
				.withLength(5, 16)
				.withReleaseDate(LocalDate.of(2011, 8, 13))
				.buildSong();
		songs.add(blowExxxplode);
		
		dreaming = new SongBuilder()
				.withTitle("Dreaming")
				.withArtists(new HashSet<Artist>(Arrays.asList(projectFortySix, fiveteenGrams)))
				.withFeaturedArtists(new HashSet<Artist>(Arrays.asList(matthewSartori)))
				.withGenre(Genre.HOUSE)
				.withLength(5, 20)
				.withReleaseDate(LocalDate.of(2011, 9, 17))
				.buildSong();
		songs.add(dreaming);
		
		lost = new SongBuilder()
				.withTitle("Lost")
				.withArtists(new HashSet<Artist>(Arrays.asList(twoThirds)))
				.withGenre(Genre.DRUM_AND_BASS)
				.withLength(6, 54)
				.withReleaseDate(LocalDate.of(2011, 9, 13))
				.buildSong();
		songs.add(lost);
		
		anotherWorld = new SongBuilder()
				.withTitle("Another World")
				.withArtists(new HashSet<Artist>(Arrays.asList(obsidia)))
				.withGenre(Genre.DUBSTEP)
				.withLength(3, 52)
				.withReleaseDate(LocalDate.of(2011, 9, 8))
				.buildSong();
		songs.add(anotherWorld);
		
		weMove = new SongBuilder()
				.withTitle("We Move")
				.withArtists(new HashSet<Artist>(Arrays.asList(feint)))
				.withGenre(Genre.DRUM_AND_BASS)
				.withLength(3, 51)
				.withReleaseDate(LocalDate.of(2011, 9, 4))
				.buildSong();
		songs.add(weMove);
		
		tanpopo = new SongBuilder()
				.withTitle("Tanpopo")
				.withArtists(new HashSet<Artist>(Arrays.asList(eminence)))
				.withGenre(Genre.TRANCE)
				.withLength(7, 8)
				.withReleaseDate(LocalDate.of(2011, 9, 1))
				.buildSong();
		songs.add(tanpopo);
		
		totallyRadical = new SongBuilder()
				.withTitle("Totally Radical")
				.withArtists(new HashSet<Artist>(Arrays.asList(haloNova)))
				.withGenre(Genre.DUBSTEP)
				.withLength(3, 46)
				.withReleaseDate(LocalDate.of(2011, 8, 30))
				.buildSong();
		songs.add(totallyRadical);
		
		metropolis = new SongBuilder()
				.withTitle("Metropolis")
				.withArtists(new HashSet<Artist>(Arrays.asList(stephenWalking)))
				.withGenre(Genre.DUBSTEP)
				.withLength(4, 29)
				.withReleaseDate(LocalDate.of(2011, 8, 28))
				.buildSong();
		songs.add(metropolis);
		
		airwaves = new SongBuilder()
				.withTitle("Airwaves")
				.withArtists(new HashSet<Artist>(Arrays.asList(noisestorm)))
				.withGenre(Genre.ELECTRO)
				.withLength(4, 41)
				.withReleaseDate(LocalDate.of(2011, 8, 25))
				.buildSong();
		songs.add(airwaves);
		
		obsession = new SongBuilder()
				.withTitle("Obsession")
				.withArtists(new HashSet<Artist>(Arrays.asList(neilio)))
				.withGenre(Genre.HARD_DANCE)
				.withLength(6, 4)
				.withReleaseDate(LocalDate.of(2011, 8, 17))
				.buildSong();
		songs.add(obsession);
		
		rockTheHouse = new SongBuilder()
				.withTitle("Rock the House")
				.withArtists(new HashSet<Artist>(Arrays.asList(matduke)))
				.withGenre(Genre.HARD_DANCE)
				.withLength(5, 2)
				.withReleaseDate(LocalDate.of(2011, 8, 8))
				.buildSong();
		songs.add(rockTheHouse);
		
		lightPollution = new SongBuilder()
				.withTitle("Light Pollution")
				.withArtists(new HashSet<Artist>(Arrays.asList(stephenWalking)))
				.withGenre(Genre.DUBSTEP)
				.withLength(3, 1)
				.withReleaseDate(LocalDate.of(2011, 8, 2))
				.buildSong();
		songs.add(lightPollution);
		
		triceracops = new SongBuilder()
				.withTitle("Triceracops")
				.withArtists(new HashSet<Artist>(Arrays.asList(haloNova)))
				.withGenre(Genre.DUBSTEP)
				.withLength(4, 41)
				.withReleaseDate(LocalDate.of(2011, 7, 20))
				.buildSong();
		songs.add(triceracops);
		
		theBassex = new SongBuilder()
				.withTitle("The BASSEX")
				.withArtists(new HashSet<Artist>(Arrays.asList(arion)))
				.withGenre(Genre.DUBSTEP)
				.withLength(3, 33)
				.withReleaseDate(LocalDate.of(2011, 9, 20))
				.buildSong();
		songs.add(theBassex);
		
		songRepository.saveAll(songs);
		
		/*
		song = new SongBuilder()
				.withTitle("x")
				.withArtists(new HashSet<Artist>(Arrays.asList(x...)))
				.withFeaturedArtists(new HashSet<Artist>(Arrays.asList(x...)))
				.withGenre(Genre.x)
				.withLength(x, x)
				.withReleaseDate(LocalDate.of(20xx, x, x))
				.withCatalogNumber("MC"x)
				.buildSong();
		songs.add(x);
		*/
	}
	
	private void initMonstercatAlbums() {
		compilationAlbums = new HashSet<CompilationAlbum>();
		
		launchWeek = new CompilationAlbumBuilder()
				.withTitle("Launch Week")
				.withReleaseDate(LocalDate.of(2011, 7, 12))
				.withCompilationType(CompilatonType.MONSTERCAT_COMPILATION)
				.withCatalogNumber("MC001")
				.build();
		launchWeek.addSong(coldBloodAndIceCreamCones);
		launchWeek.addSong(atlas);
		launchWeek.addSong(dubstepKilledRockAndRoll);
		launchWeek.addSong(hello);
		launchWeek.addSong(theForce);
		launchWeek.addSong(captivating);
		launchWeek.addSong(stillWalking);
		compilationAlbums.add(launchWeek);
		
		earlyStage = new CompilationAlbumBuilder()
				.withTitle("Early Stage")
				.withReleaseDate(LocalDate.of(2011, 9, 28))
				.withCompilationType(CompilatonType.MONSTERCAT_COMPILATION)
				.withCatalogNumber("MC002")
				.build();
		earlyStage.addSong(someWobbles);
		earlyStage.addSong(blowExxxplode);
		earlyStage.addSong(dreaming);
		earlyStage.addSong(lost);
		earlyStage.addSong(anotherWorld);
		earlyStage.addSong(weMove);
		earlyStage.addSong(tanpopo);
		earlyStage.addSong(totallyRadical);
		earlyStage.addSong(metropolis);
		earlyStage.addSong(airwaves);
		earlyStage.addSong(obsession);
		earlyStage.addSong(rockTheHouse);
		earlyStage.addSong(lightPollution);
		earlyStage.addSong(triceracops);
		earlyStage.addSong(theBassex);
		compilationAlbums.add(earlyStage);
		
		albumRepository.saveAll(compilationAlbums);
		
		/*
		album = new CompilationAlbumBuilder()
				.withTitle("x")
				.withReleaseDate(LocalDate.of(, , ))
				.withCompilationType(CompilatonType.MONSTERCAT_COMPILATION)
				.withCatalogNumber("MC")
				.build();
		album.addSong(x);
		compilationAlbums.add(album);
		*/
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
