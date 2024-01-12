package com.example.tuneHub.demoservices;

import java.util.List;

import com.example.tuneHub.entites.Song;

public interface SongService
{

	public void addSong(Song song);

	public List<Song> fetchAllSongs();

	public boolean songExists(String name);
	public void updateSong(Song song);

}
