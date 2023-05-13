package com.example.demo.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.URLDTO;
import com.example.demo.Entity.Url;
import com.example.demo.Repository.Redisrepo;

import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/create")
public class URLController {

	@Autowired
	Redisrepo rs;
	
	@PostMapping("/save")
	public Url setURl(@RequestBody URLDTO utd)
	{
		return rs.setsave(utd);
	}
	@GetMapping("/get/{id}")
	public void getURL(@PathVariable String id,HttpServletResponse session) throws IOException
	{
		session.sendRedirect(rs.getURL(id));
		
	}
}
