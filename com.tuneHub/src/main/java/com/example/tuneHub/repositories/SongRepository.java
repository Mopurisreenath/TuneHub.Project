package com.example.tuneHub.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tuneHub.entites.Song;

public interface SongRepository  extends JpaRepository<Song, Integer>
{

	public Song findByName(String name);
	

}
