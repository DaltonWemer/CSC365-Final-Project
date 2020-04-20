package edu.missouristate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {

	@ResponseBody
	@GetMapping("/string")
	public String getString() {
		return "<strong>Hello World!</strong>";
	}
	
	@GetMapping(value = {"/home", "/"})
	public String getHome() {
		return "home";
	}
	
	// Handles posts to the server (usually forms)
	// Could be AJAX calls as well
	@PostMapping("/home")
	public String postHome() {
		return "home";
	}
	
}
