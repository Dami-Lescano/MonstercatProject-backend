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
import app.enumerate.CompilationType;
import app.enumerate.Country;
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
	
	private Artist alexFarway;
	private Artist hellberg;
	private Artist metzen;
	private Artist mrFijiWiji;
	private Artist varien;
	
	private Artist dotExe;
	private Artist gemellini;
	private Artist muzzy;
	private Artist rezonate;
	private Artist tristam;
	private Artist yh;
	private Artist corinneLee;
	
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
	
	//003 - Momentum
	private Song shivers;
	private Song limitless;
	private Song belgium;
	private Song android;
	private Song topOfTheWorld;
	private Song stockholm;
	private Song division;
	private Song theTechnician;
	private Song insomnia;
	private Song fullGrizzly;
	private Song formless;
	private Song fullFocus;
	private Song slide;
	private Song elementsOfSanity;
	private Song cloakAndDagger;
	
	//004 - Identity
	private Song deadline;
	private Song theDestroyer;
	private Song runAwayFromMe;
	private Song oblivion;
	private Song ridingTheStorm;
	private Song crazy;
	private Song partyForTheLiving;
	private Song partTwo;
	private Song strongArm;
	private Song killItWithFire;
	private Song spazzOut;
	private Song stereo;
	private Song audiocidity;
	private Song outsideThisWorld;
	private Song pumpIt;
	
	//Monstercat Compilations		private CompilationAlbum x;
	private CompilationAlbum launchWeek;
	private CompilationAlbum earlyStage;
	private CompilationAlbum momentum;
	private CompilationAlbum identity;
	
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
				.withCountry(Country.CANADA)
				.withInitYear(2008)
				.build();
		artists.add(ephixa);
		
		haloNova = new ArtistBuilder()
				.withArtistName("Halo Nova")
				.withRealName(new ArrayList<String>(Arrays.asList("Nikki Kaelar")))
				.withBirthDate(LocalDate.of(1990, 5, 15))
				.withCountry(Country.UNITED_STATES)
				.withInitYear(2011)
				.build();
		artists.add(haloNova);
		
		stephenWalking = new ArtistBuilder()
				.withArtistName("Stephen Walking")
				.withRealName(new ArrayList<String>(Arrays.asList("Michael Arthur Toope")))
				.withCountry(Country.CANADA)
				.withInitYear(2010)
				.build();
		artists.add(stephenWalking);
		
		arion = new ArtistBuilder()
				.withArtistName("Arion")
				.withRealName(new ArrayList<String>(Arrays.asList("Arion Alijah Anderson")))
				.withInitYear(2009)
				.build();
		artists.add(arion);
		
		goingQuantum = new ArtistBuilder()
				.withArtistName("Going Quantum")
				.withRealName(new ArrayList<String>(Arrays.asList("Jonathan Winter")))
				.withCountry(Country.CANADA)
				.withInitYear(2011)
				.build();
		artists.add(goingQuantum);
		
		feint = new ArtistBuilder()
				.withArtistName("Feint")
				.withRealName(new ArrayList<String>(Arrays.asList("Andrew Hu")))
				.withCountry(Country.UNITED_KINGDOM)
				.withInitYear(2011)
				.build();
		artists.add(feint);
		
		neilio = new ArtistBuilder()
				.withArtistName("Neilio")
				.withRealName(new ArrayList<String>(Arrays.asList("Neil Patrick Burke")))
				.withCountry(Country.IRELAND)
				.withInitYear(2011)
				.build();
		artists.add(neilio);
		
		//002 - Early Stage
		
		fiveteenGrams = new ArtistBuilder()
				.withArtistName("15grams")
				.withRealName(new ArrayList<String>(Arrays.asList("Brendan Mosca")))
				.withCountry(Country.AUSTRALIA)
				.build();
		artists.add(fiveteenGrams);
		
		eminence = new ArtistBuilder()
				.withArtistName("Eminence")
				.withRealName(new ArrayList<String>(Arrays.asList("Mathew William Kenneth Kazmierowski", "Dillon Jun Ho Wong")))
				.withCountry(Country.CANADA)
				.withInitYear(2010)
				.build();
		artists.add(eminence);
		
		matduke = new ArtistBuilder()
				.withArtistName("Matduke")
				.withRealName(new ArrayList<String>(Arrays.asList("Mathieu Giguère")))
				.withCountry(Country.CANADA)
				.withInitYear(2008)
				.build();
		artists.add(matduke);
		
		noisestorm = new ArtistBuilder()
				.withArtistName("Noisestorm")
				.withRealName(new ArrayList<String>(Arrays.asList("Eoin Marc O' Broin")))
				.withCountry(Country.IRELAND)
				.withInitYear(2010)
				.build();
		artists.add(noisestorm);
		
		obsidia = new ArtistBuilder()
				.withArtistName("Obsidia")
				.withRealName(new ArrayList<String>(Arrays.asList("Domenic Ganley")))
				.withCountry(Country.UNITED_KINGDOM)
				.withInitYear(2010)
				.build();
		artists.add(obsidia);
		
		projectFortySix = new ArtistBuilder()
				.withArtistName("Project 46")
				.withRealName(new ArrayList<String>(Arrays.asList("Thomas Edward Shaw", "Ryan Leonard Henderson")))
				.withCountry(Country.CANADA)
				.withInitYear(2011)
				.build();
		artists.add(projectFortySix);
		
		twoThirds = new ArtistBuilder()
				.withArtistName("TwoThirds")
				.withRealName(new ArrayList<String>(Arrays.asList("Lewis Michael Dransfield")))
				.withBirthDate(LocalDate.of(1993, 9, 13))
				.withCountry(Country.UNITED_KINGDOM)
				.withInitYear(2009)
				.build();
		artists.add(twoThirds);
		
		matthewSartori = new ArtistBuilder()
				.withArtistName("Matthew Sartori")
				.withRealName(new ArrayList<String>(Arrays.asList("Matthew Sartori")))
				.withCountry(Country.CANADA)
				.build();
		artists.add(matthewSartori);
		
		//003 - Momentum
		
		alexFarway = new ArtistBuilder()
				.withArtistName("Alex Farway")
				.withRealName(new ArrayList<String>(Arrays.asList("Alexandre Douste")))
				.withCountry(Country.CANADA)
				.build();
		artists.add(alexFarway);
		
		hellberg = new ArtistBuilder()
				.withArtistName("Hellberg")
				.withRealName(new ArrayList<String>(Arrays.asList("Jonathan Sven Thomas Hellberg")))
				.withCountry(Country.SWEDEN)
				.withInitYear(2011)
				.withEndYear(2022)
				.build();
		artists.add(hellberg);
		
		metzen = new ArtistBuilder()
				.withArtistName("Metzen")
				.withRealName(new ArrayList<String>(Arrays.asList("Mark")))
				.withCountry(Country.CANADA)
				.build();
		artists.add(metzen);
		
		mrFijiWiji = new ArtistBuilder()
				.withArtistName("Mr FijiWiji")
				.withRealName(new ArrayList<String>(Arrays.asList("Brendan Matthew Galdo")))
				.withCountry(Country.UNITED_STATES)
				.withInitYear(2011)
				.build();
		artists.add(mrFijiWiji);
		
		varien = new ArtistBuilder()
				.withArtistName("Varien")
				.withRealName(new ArrayList<String>(Arrays.asList("Nikki Kaelar")))
				.withBirthDate(LocalDate.of(1990, 5, 15))
				.withCountry(Country.UNITED_STATES)
				.withInitYear(2011)
				.build();
		artists.add(varien);
		
		//004 - Identity
		
		dotExe = new ArtistBuilder()
				.withArtistName("DotEXE")
				.withRealName(new ArrayList<String>(Arrays.asList("Scott Jackson Stanley")))
				.withCountry(Country.UNITED_STATES)
				.withInitYear(2010)
				.build();
		artists.add(dotExe);
		
		gemellini = new ArtistBuilder()
				.withArtistName("Gemellini")
				.withRealName(new ArrayList<String>(Arrays.asList("Andrea Sartori", "Davide Sartori")))
				.withCountry(Country.AUSTRALIA)
				.withInitYear(2008)
				.build();
		artists.add(gemellini);
		
		muzzy = new ArtistBuilder()
				.withArtistName("Muzzy")
				.withRealName(new ArrayList<String>(Arrays.asList("Mustafa Ahmed Alobaidi")))
				.withBirthDate(LocalDate.of(1994, 11, 10))
				.withCountry(Country.UNITED_KINGDOM)
				.withInitYear(2011)
				.build();
		artists.add(muzzy);
		
		rezonate = new ArtistBuilder()
				.withArtistName("Rezonate")
				.withRealName(new ArrayList<String>(Arrays.asList("Nicholas John Rennie")))
				.withCountry(Country.CANADA)
				.withInitYear(2011)
				.withEndYear(2019)
				.build();
		artists.add(rezonate);
		
		tristam = new ArtistBuilder()
				.withArtistName("Tristam")
				.withRealName(new ArrayList<String>(Arrays.asList("Leandre Bérubé Bergeron")))
				.withBirthDate(LocalDate.of(1995, 2, 26))
				.withCountry(Country.CANADA)
				.withInitYear(2008)
				.withEndYear(2021)
				.build();
		artists.add(tristam);
		
		yh = new ArtistBuilder()
				.withArtistName("yh")
				.withRealName(new ArrayList<String>(Arrays.asList("Yonaton Habte")))
				.withCountry(Country.UNITED_STATES)
				.withInitYear(2011)
				.build();
		artists.add(yh);
		
		corinneLee = new ArtistBuilder()
				.withArtistName("Corinne Lee")
				.withRealName(new ArrayList<String>(Arrays.asList("Corinne Lee")))
				.build();
		artists.add(corinneLee);
		/*
		artist = new ArtistBuilder()
				.withArtistName("")
				.withRealName(new ArrayList<String>(Arrays.asList("")))
				.withBirthDate(LocalDate.of(, , ))
				.withCountry(Country.)
				.withInitYear()
				.withEndYear()
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
		
		//003 - Momentum
		
		shivers = new SongBuilder()
				.withTitle("Shivers")
				.withArtists(new HashSet<Artist>(Arrays.asList(matduke, metzen)))
				.withGenre(Genre.HARD_DANCE)
				.withLength(4, 45)
				.withReleaseDate(LocalDate.of(2011, 10, 4))
				.buildSong();
		songs.add(shivers);
		
		limitless = new SongBuilder()
				.withTitle("Limitless")
				.withArtists(new HashSet<Artist>(Arrays.asList(projectFortySix)))
				.withGenre(Genre.HOUSE)
				.withLength(7, 0)
				.withReleaseDate(LocalDate.of(2011, 10, 6))
				.buildSong();
		songs.add(limitless);
		
		belgium = new SongBuilder()
				.withTitle("Belgium")
				.withArtists(new HashSet<Artist>(Arrays.asList(eminence, alexFarway)))
				.withGenre(Genre.TRANCE)
				.withLength(6, 44)
				.withReleaseDate(LocalDate.of(2011, 10, 8))
				.buildSong();
		songs.add(belgium);
		
		android = new SongBuilder()
				.withTitle("Android")
				.withArtists(new HashSet<Artist>(Arrays.asList(obsidia)))
				.withGenre(Genre.DUBSTEP)
				.withLength(5, 9)
				.withReleaseDate(LocalDate.of(2011, 10, 10))
				.buildSong();
		songs.add(android);
		
		topOfTheWorld = new SongBuilder()
				.withTitle("Top of the World")
				.withArtists(new HashSet<Artist>(Arrays.asList(stephenWalking)))
				.withGenre(Genre.ELECTRO)
				.withLength(3, 0)
				.withReleaseDate(LocalDate.of(2011, 10, 12))
				.buildSong();
		songs.add(topOfTheWorld);
		
		stockholm = new SongBuilder()
				.withTitle("Stockholm")
				.withArtists(new HashSet<Artist>(Arrays.asList(hellberg)))
				.withGenre(Genre.HOUSE)
				.withLength(4, 20)
				.withReleaseDate(LocalDate.of(2011, 10, 14))
				.buildSong();
		songs.add(stockholm);
		
		division = new SongBuilder()
				.withTitle("Division")
				.withArtists(new HashSet<Artist>(Arrays.asList(ephixa)))
				.withGenre(Genre.DUBSTEP)
				.withLength(6, 10)
				.withReleaseDate(LocalDate.of(2011, 10, 19))
				.buildSong();
		songs.add(division);
		
		theTechnician = new SongBuilder()
				.withTitle("The Technician")
				.withArtists(new HashSet<Artist>(Arrays.asList(matduke)))
				.withRemixers(new HashSet<Artist>(Arrays.asList(neilio)))
				.withGenre(Genre.HARD_DANCE)
				.withLength(5, 30)
				.withReleaseDate(LocalDate.of(2011, 10, 17))
				.buildSong();
		songs.add(theTechnician);
		
		insomnia = new SongBuilder()
				.withTitle("Insomnia")
				.withArtists(new HashSet<Artist>(Arrays.asList(mrFijiWiji)))
				.withGenre(Genre.DUBSTEP)
				.withLength(3, 18)
				.withReleaseDate(LocalDate.of(2011, 10, 21))
				.buildSong();
		songs.add(insomnia);
		
		fullGrizzly = new SongBuilder()
				.withTitle("Full Grizzly")
				.withArtists(new HashSet<Artist>(Arrays.asList(goingQuantum, stephenWalking)))
				.withGenre(Genre.DUBSTEP)
				.withLength(3, 32)
				.withReleaseDate(LocalDate.of(2011, 10, 26))
				.buildSong();
		songs.add(fullGrizzly);
		
		formless = new SongBuilder()
				.withTitle("Formless")
				.withArtists(new HashSet<Artist>(Arrays.asList(feint)))
				.withGenre(Genre.DRUMSTEP)
				.withLength(4, 35)
				.withReleaseDate(LocalDate.of(2011, 10, 28))
				.buildSong();
		songs.add(formless);
		
		fullFocus = new SongBuilder()
				.withTitle("Full Focus")
				.withArtists(new HashSet<Artist>(Arrays.asList(noisestorm)))
				.withGenre(Genre.DRUMSTEP)
				.withLength(3, 57)
				.withReleaseDate(LocalDate.of(2011, 10, 24))
				.buildSong();
		songs.add(fullFocus);
		
		slide = new SongBuilder()
				.withTitle("Slide")
				.withArtists(new HashSet<Artist>(Arrays.asList(projectFortySix)))
				.withGenre(Genre.HOUSE)
				.withLength(7, 3)
				.withReleaseDate(LocalDate.of(2011, 11, 2))
				.buildSong();
		songs.add(slide);
		
		elementsOfSanity = new SongBuilder()
				.withTitle("Elements of Sanity")
				.withArtists(new HashSet<Artist>(Arrays.asList(arion)))
				.withGenre(Genre.DUBSTEP)
				.withLength(3, 48)
				.withReleaseDate(LocalDate.of(2011, 11, 4))
				.buildSong();
		songs.add(elementsOfSanity);
		
		cloakAndDagger = new SongBuilder()
				.withTitle("Cloak and Dagger")
				.withArtists(new HashSet<Artist>(Arrays.asList(varien)))
				.withGenre(Genre.DUBSTEP)
				.withLength(4, 14)
				.withReleaseDate(LocalDate.of(2011, 10, 31))
				.buildSong();
		songs.add(cloakAndDagger);
		
		//004 - Identity
		
		deadline = new SongBuilder()
				.withTitle("Deadline")
				.withArtists(new HashSet<Artist>(Arrays.asList(projectFortySix, gemellini)))
				.withGenre(Genre.HOUSE)
				.withLength(6, 20)
				.withReleaseDate(LocalDate.of(2011, 12, 16))
				.withCatalogNumber("MCS001")
				.buildSong();
		songs.add(deadline);
		
		theDestroyer = new SongBuilder()
				.withTitle("The Destroyer")
				.withArtists(new HashSet<Artist>(Arrays.asList(muzzy)))
				.withRemixers(new HashSet<Artist>(Arrays.asList(twoThirds)))
				.withGenre(Genre.DRUM_AND_BASS)
				.withLength(5, 4)
				.withReleaseDate(LocalDate.of(2011, 11, 11))
				.buildSong();
		songs.add(theDestroyer);
		
		runAwayFromMe = new SongBuilder()
				.withTitle("Run Away From Me")
				.withArtists(new HashSet<Artist>(Arrays.asList(dotExe)))
				.withGenre(Genre.DRUMSTEP)
				.withLength(4, 37)
				.withReleaseDate(LocalDate.of(2011, 12, 2))
				.buildSong();
		songs.add(runAwayFromMe);
		
		oblivion = new SongBuilder()
				.withTitle("Oblivion")
				.withArtists(new HashSet<Artist>(Arrays.asList(obsidia)))
				.withGenre(Genre.DUBSTEP)
				.withLength(3, 57)
				.withReleaseDate(LocalDate.of(2011, 11, 16))
				.buildSong();
		songs.add(oblivion);
		
		ridingTheStorm = new SongBuilder()
				.withTitle("Riding the Storm")
				.withArtists(new HashSet<Artist>(Arrays.asList(muzzy)))
				.withGenre(Genre.DRUM_AND_BASS)
				.withLength(4, 33)
				.withReleaseDate(LocalDate.of(2011, 11, 23))
				.buildSong();
		songs.add(ridingTheStorm);
		
		crazy = new SongBuilder()
				.withTitle("Crazy")
				.withArtists(new HashSet<Artist>(Arrays.asList(projectFortySix, gemellini)))
				.withFeaturedArtists(new HashSet<Artist>(Arrays.asList(corinneLee)))
				.withGenre(Genre.HOUSE)
				.withLength(7, 6)
				.withReleaseDate(LocalDate.of(2011, 11, 14))
				.buildSong();
		songs.add(crazy);
		
		partyForTheLiving = new SongBuilder()
				.withTitle("Party for the Living")
				.withArtists(new HashSet<Artist>(Arrays.asList(tristam)))
				.withGenre(Genre.DUBSTEP)
				.withLength(3, 8)
				.withReleaseDate(LocalDate.of(2011, 11, 25))
				.buildSong();
		songs.add(partyForTheLiving);
		
		partTwo = new SongBuilder()
				.withTitle("Part Two")
				.withArtists(new HashSet<Artist>(Arrays.asList(yh)))
				.withGenre(Genre.DUBSTEP)
				.withLength(3, 41)
				.withReleaseDate(LocalDate.of(2011, 12, 12))
				.buildSong();
		songs.add(partTwo);
		
		strongArm = new SongBuilder()
				.withTitle("Strong Arm")
				.withArtists(new HashSet<Artist>(Arrays.asList(stephenWalking)))
				.withGenre(Genre.DUBSTEP)
				.withLength(4, 13)
				.withReleaseDate(LocalDate.of(2011, 11, 28))
				.buildSong();
		songs.add(strongArm);
		
		killItWithFire = new SongBuilder()
				.withTitle("Kill It With Fire")
				.withArtists(new HashSet<Artist>(Arrays.asList(dotExe)))
				.withGenre(Genre.DUBSTEP)
				.withLength(3, 56)
				.withReleaseDate(LocalDate.of(2011, 11, 7))
				.buildSong();
		songs.add(killItWithFire);
		
		spazzOut = new SongBuilder()
				.withTitle("Spazz Out")
				.withArtists(new HashSet<Artist>(Arrays.asList(arion)))
				.withGenre(Genre.DUBSTEP)
				.withLength(4, 20)
				.withReleaseDate(LocalDate.of(2011, 12, 14))
				.buildSong();
		songs.add(spazzOut);
		
		stereo = new SongBuilder()
				.withTitle("Stereo")
				.withArtists(new HashSet<Artist>(Arrays.asList(hellberg)))
				.withGenre(Genre.HOUSE)
				.withLength(5, 44)
				.withReleaseDate(LocalDate.of(2011, 12, 7))
				.buildSong();
		songs.add(stereo);
		
		audiocidity = new SongBuilder()
				.withTitle("Audiocidity")
				.withArtists(new HashSet<Artist>(Arrays.asList(ephixa)))
				.withGenre(Genre.HARD_DANCE)
				.withLength(3, 39)
				.withReleaseDate(LocalDate.of(2011, 11, 30))
				.buildSong();
		songs.add(audiocidity);
		
		outsideThisWorld = new SongBuilder()
				.withTitle("Outside This World")
				.withArtists(new HashSet<Artist>(Arrays.asList(neilio)))
				.withGenre(Genre.HARD_DANCE)
				.withLength(5, 41)
				.withReleaseDate(LocalDate.of(2011, 12, 5))
				.buildSong();
		songs.add(outsideThisWorld);
		
		pumpIt = new SongBuilder()
				.withTitle("Pump It!")
				.withArtists(new HashSet<Artist>(Arrays.asList(rezonate)))
				.withGenre(Genre.ELECTRO)
				.withLength(4, 7)
				.withReleaseDate(LocalDate.of(2011, 12, 19))
				.buildSong();
		songs.add(pumpIt);
		
		songRepository.saveAll(songs);
		
		/*
		song = new SongBuilder()
				.withTitle("")
				.withArtists(new HashSet<Artist>(Arrays.asList()))
				.withGenre(Genre.)
				.withLength(, )
				.withReleaseDate(LocalDate.of(20, , ))
				.withCatalogNumber("MCS0")
				.buildSong();
		songs.add();
		*/
	}
	
	private void initMonstercatAlbums() {
		compilationAlbums = new HashSet<CompilationAlbum>();
		
		launchWeek = new CompilationAlbumBuilder()
				.withTitle("Monstercat 001 - Launch Week")
				.withReleaseDate(LocalDate.of(2011, 7, 12))
				.withCompilationType(CompilationType.MONSTERCAT_COMPILATION)
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
				.withTitle("Monstercat 002 - Early Stage")
				.withReleaseDate(LocalDate.of(2011, 9, 28))
				.withCompilationType(CompilationType.MONSTERCAT_COMPILATION)
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
		
		momentum = new CompilationAlbumBuilder()
				.withTitle("Monstercat 003 - Momentum")
				.withReleaseDate(LocalDate.of(2011, 11, 7))
				.withCompilationType(CompilationType.MONSTERCAT_COMPILATION)
				.withCatalogNumber("MC003")
				.build();
		momentum.addSong(shivers);
		momentum.addSong(limitless);
		momentum.addSong(belgium);
		momentum.addSong(android);
		momentum.addSong(topOfTheWorld);
		momentum.addSong(stockholm);
		momentum.addSong(division);
		momentum.addSong(theTechnician);
		momentum.addSong(insomnia);
		momentum.addSong(fullGrizzly);
		momentum.addSong(formless);
		momentum.addSong(fullFocus);
		momentum.addSong(slide);
		momentum.addSong(elementsOfSanity);
		momentum.addSong(cloakAndDagger);
		compilationAlbums.add(momentum);
		
		identity = new CompilationAlbumBuilder()
				.withTitle("Monstercat 004 - Identity")
				.withReleaseDate(LocalDate.of(2011, 12, 18))
				.withCompilationType(CompilationType.MONSTERCAT_COMPILATION)
				.withCatalogNumber("MC004")
				.build();
		identity.addSong(deadline);
		identity.addSong(theDestroyer);
		identity.addSong(runAwayFromMe);
		identity.addSong(oblivion);
		identity.addSong(ridingTheStorm);
		identity.addSong(crazy);
		identity.addSong(partyForTheLiving);
		identity.addSong(partTwo);
		identity.addSong(strongArm);
		identity.addSong(killItWithFire);
		identity.addSong(spazzOut);
		identity.addSong(stereo);
		identity.addSong(audiocidity);
		identity.addSong(outsideThisWorld);
		identity.addSong(pumpIt);
		compilationAlbums.add(identity);
		
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
