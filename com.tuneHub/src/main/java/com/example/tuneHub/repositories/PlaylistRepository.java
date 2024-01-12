package com.example.tuneHub.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tuneHub.entites.Playlist;

public interface PlaylistRepository extends JpaRepository<Playlist, Integer>
{

}
