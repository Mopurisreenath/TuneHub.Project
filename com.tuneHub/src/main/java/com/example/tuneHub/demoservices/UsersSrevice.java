package com.example.tuneHub.demoservices;

import com.example.tuneHub.entites.Users;

public interface UsersSrevice
{
	public String addUsers(Users user);
	public boolean emailExists(String email);
	public boolean validateUser(String email,String password);
	public String getRole(String email);
	public void updateUser(Users user);
	public Users getUser(String email);

}
