package app.model;

import java.util.Iterator;
import java.util.List;

import app.dto.ArtistAlbumDTO;
import app.dto.ArtistItem;
import app.dto.CompilationAlbumDTO;
import app.dto.SongDTO;
import app.dto.SongItem;

public abstract class Converter {
	//length
	public static String intToLength(int length) {
		Integer minutes = length / 60;
		Integer seconds = length % 60;
		String secondsString = seconds.toString();
		if (seconds < 10) {
			secondsString = "0".concat(secondsString);
		}
		return minutes.toString().concat(":").concat(secondsString);
	}
	
	public static Integer lengthToInt(int minutes, int seconds) {
		return minutes * 60 + seconds;
	}
	
	//songs
	public static SongDTO songToDTO(Song song) {
		SongDTO songDTO = new SongDTO();
		songDTO.setSongId(song.getSongId());
		songDTO.setTitle(song.getTitle());
		songDTO.setLength(song.getLengthInString());
		songDTO.setLengthMinutes(song.getMinutes());
		songDTO.setLengthSeconds(song.getSeconds());
		songDTO.setCatalogNumber(song.getCatalogNumber());
		songDTO.setGenreName(song.getGenre().getName());
		songDTO.setGenre(song.getGenre());
		songDTO.setReleaseDate(song.getReleaseDateInString());
		songDTO.setArtists(artistsToItems(song.getArtists().stream().toList()));
		songDTO.setFeaturedArtists(artistsToItems(song.getFeaturedArtists().stream().toList()));
		songDTO.setRemixers(artistsToItems(song.getRemixers().stream().toList()));
		return songDTO;
	}
	
	public static List<SongDTO> songsToDTOs(List<Song> songs) {
		return songs.stream().map(song -> songToDTO(song)).toList();
	}
	
	public static SongItem songToItem(Song song) {
		SongItem songItem = new SongItem(songFullName(song), song.getSongId());
		return songItem;
	}
	
	public static List<SongItem> songsToItems(List<Song> songs) {
		return songs.stream().map(song -> songToItem(song)).toList();
	}
	
	private static String songFullName(Song song) {
		StringBuilder sb = new StringBuilder();
		
		List<String> artists = song.getArtistsInStrings();
		List<String> featuredArtists = song.getFeaturedArtistsInStrings();
		List<String> remixers = song.getRemixersInStrings();
		
		concatArtists(artists, sb);
		
		sb.append(" - ");
		sb.append(song.getTitle());
		
		if (featuredArtists.size() > 0) {
			sb.append(" (con ");
			concatArtists(featuredArtists, sb);
			sb.append(")");
		}
		
		if (remixers.size() > 0) {
			sb.append(" (");
			concatArtists(remixers, sb);
			sb.append(" Remix)");
		}
		
		return sb.toString();
	}
	
	private static void concatArtists(List<String> artists, StringBuilder sb) {
		for (int i = 0; i < artists.size(); i++) {
			if (i == 0) {
				sb.append(artists.get(i));
			}
			else if (i == artists.size() - 1) {
				sb.append(" & ");
				sb.append(artists.get(i));
			}
			else {
				sb.append(", ");
				sb.append(artists.get(i));
			}
		}
	}
	
	//artists
	public static ArtistItem artistToItem(Artist artist) {
		return new ArtistItem(artist.getArtistName(), artist.getArtistId());
	}
	
	public static List<ArtistItem> artistsToItems(List<Artist> artists) {
		return artists.stream().map(a -> artistToItem(a)).toList();
	}
	
	//albums
	public static CompilationAlbumDTO compilationAlbumToDTO(CompilationAlbum album) {
		CompilationAlbumDTO albumDTO = new CompilationAlbumDTO();
		albumDTO.setId(album.getAlbumId());
		albumDTO.setTitle(album.getTitle());
		albumDTO.setReleaseDate(album.getReleaseDateInString());
		albumDTO.setCatalogNumber(album.getCatalogNumber());
		albumDTO.setLength(album.getLength());
		albumDTO.setNumberOfSongs(album.getNumberOfSongs());
		List<Song> songs = album.getSongs().values().stream().toList();
		albumDTO.setSongs(Converter.songsToItems(songs));
		albumDTO.setCompilationType(album.getCompilationType());
		albumDTO.setCompilationTypeName(album.getCompilationType().getTipo());
		
		return albumDTO;
	}
	
	public static ArtistAlbumDTO artistAlbumToDTO(ArtistAlbum album) {
		ArtistAlbumDTO albumDTO = new ArtistAlbumDTO();
		albumDTO.setId(album.getAlbumId());
		albumDTO.setTitle(album.getTitle());
		albumDTO.setReleaseDate(album.getReleaseDateInString());
		albumDTO.setCatalogNumber(album.getCatalogNumber());
		albumDTO.setLength(album.getLength());
		albumDTO.setNumberOfSongs(album.getNumberOfSongs());
		List<Song> songs = album.getSongs().values().stream().toList();
		albumDTO.setSongs(Converter.songsToItems(songs));
		List<ArtistItem> artists = Converter.artistsToItems(album.getArtists().stream().toList());
		albumDTO.setArtists(artists);
		
		return albumDTO;
	}
}
