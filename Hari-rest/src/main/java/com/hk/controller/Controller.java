package com.hk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller 
{
	@GetMapping("/wish")
	public String wish()
	{
		return "hello boss how are you";
	}
	@GetMapping("/greet")
	public String greet()
	{
		return "hello good afternoon";
	}
	@GetMapping("/contact")
	public String contact()
	{
		return "6302566280";
	}


}
