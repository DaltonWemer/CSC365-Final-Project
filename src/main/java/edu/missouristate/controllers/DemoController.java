package edu.missouristate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class DemoController {
	
	@GetMapping("/demo")
	public String getDemo(Model model) {
		model.addAttribute("title", "Demo Page");
		return "demo";
	}

	@GetMapping("/bootstrap")
	public String getCustomBoostrapPage() {
		return "bootstrap";
	}
	
}
