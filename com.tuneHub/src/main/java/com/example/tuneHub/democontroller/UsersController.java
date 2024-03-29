package com.example.tuneHub.democontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.tuneHub.demoservices.UsersSrevice;
import com.example.tuneHub.entites.Users;
import com.example.tuneHub.repositories.UsersRepository;

import jakarta.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class UsersController
{
	@Autowired
	UsersSrevice service;
	
	@PostMapping("/registration")
	public String addUsers(@ModelAttribute Users user)
	{
		boolean userStatus=service.emailExists(user.getEmail());
		if(userStatus==false) 
		{
			
			service.addUsers(user);
			System.out.println("user added");
			
		}
		else {
			System.out.println("User already exists");
		}
		return "home";
		
	}
	@PostMapping("/validate")
	public String validate(@RequestParam("email")String email,
			@RequestParam("password") String password,
			HttpSession session)
	{
		if(service.validateUser(email,password)==true)
		{
			String role=service.getRole(email);
			session.setAttribute("email", email);
			if(role.equals("admin"))
			{
				return "adminHome";
			}
			return "customerHome";
	}
		else
		{
			return "login";
		}
	}
	@GetMapping("/logout")
	public String logout(HttpSession session)
	{
		session.invalidate();
		return "login";
	}

}
