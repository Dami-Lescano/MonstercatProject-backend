package app.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import app.builder.SongBuilder;
import app.enumerate.Genre;

@SpringBootTest
class SongTests {
	
	private final static SongBuilder songBuilder = new SongBuilder();
	
	private Song flight = songBuilder
			.withSongId(2)
			.withTitle("Flight")
			.withGenre(Genre.DRUMSTEP)
			.withLength(3, 39)
			.withReleaseDate(LocalDate.of(2013, 2, 15))
			.withCatalogNumber("MCS107")
			.buildSong();;
	
	@BeforeAll
	static void init() {
	}

	@Test()
	void lengthToInteger() {
		assertEquals(219, flight.getLength());
	}

	@Test()
	void integerToLength() {
		assertEquals("3:39", flight.getLengthInString());
	}
}