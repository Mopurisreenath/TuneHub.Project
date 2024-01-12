package com.example.tuneHub.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tuneHub.entites.Users;

public interface UsersRepository  extends JpaRepository<Users, Integer>
{
public Users findByEmail(String emial);
}
