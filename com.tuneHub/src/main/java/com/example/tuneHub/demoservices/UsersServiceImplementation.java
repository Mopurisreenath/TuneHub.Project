package com.example.tuneHub.demoservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tuneHub.entites.Users;
import com.example.tuneHub.repositories.UsersRepository;

@Service
public class UsersServiceImplementation implements UsersSrevice
{

	@Autowired
	UsersRepository repo;

	@Override
	public String addUsers(Users user) {
		repo.save(user);
		return "user added sucessfully";
	}

	@Override
	public boolean emailExists(String email)
	{
		if(repo.findByEmail(email)==null)
		{
			return false;
		}
		else
		{
			return true;
			
		}
		
	}
	@Override
	public boolean validateUser(String email,String password)
	{
		Users user=repo.findByEmail(email);
		String db_pass=user.getPassword();
		if(password.equals(db_pass))
		{
			return true;
		}
		else
		{
			return false;
			
		}
		
	}

	@Override
	public String getRole(String email) {
		Users user=repo.findByEmail(email);
		return user.getRole();
	}

	@Override
	public Users getUser(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser(Users user) 
	{
		repo.save(user);
	
		
	}
	

	
}
