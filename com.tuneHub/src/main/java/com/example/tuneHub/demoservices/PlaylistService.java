package com.example.tuneHub.demoservices;

import java.util.List;

import com.example.tuneHub.entites.Playlist;

public interface PlaylistService {

  public void addPlaylist(Playlist playlist);

public List<Playlist> fetchAllPlaylists();

}
