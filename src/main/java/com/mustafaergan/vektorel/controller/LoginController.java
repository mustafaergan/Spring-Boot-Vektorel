package com.mustafaergan.vektorel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
	@GetMapping(path = "/login")
	public String veriekle(){
		return "index";
	}

}
