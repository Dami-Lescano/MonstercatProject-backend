package app.repository;

import org.springframework.stereotype.Repository;

import app.model.Song;

@Repository
public interface SongRepository extends GenericRepository<Song> {

}