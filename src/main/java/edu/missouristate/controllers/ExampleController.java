package edu.missouristate.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.missouristate.model.Example;
import edu.missouristate.services.ExampleService;

@Controller
public class ExampleController {

	@Autowired
	ExampleService exampleService;
	
	@Produces("application/json")
	@ResponseBody // Return String (not resource [file/JSP])
	@GetMapping(value = { "/example", "/example/foo" }) // GET method type
	public String getExample(Model model) throws Exception {
		return "Hello World!";
	}

	@GetMapping("/example/table")
	public String getExampleTable(Model model, HttpServletRequest request, HttpSession session) {
		List<Example> exampleList = exampleService.getExamples();
		model.addAttribute("exampleList", exampleList);
		return "exampleTable";
	}
	
	@GetMapping("/example/index")
	public String getIndexView(Model model, HttpServletRequest request, HttpSession session, String foo) {
		return "example";
	}

	@GetMapping(value = "/example/{action}/{myId}")
	public String getPathVariable(@PathVariable String action, @PathVariable Integer myId) {
		
		if ("delete".equalsIgnoreCase(action)) {
			System.out.println(action + " " + myId);	
		} else {
			System.out.println("Unknown action");
		}
		
		return "example";
	}

//	@PostMapping(path = "/car", consumes = "application/json")
//	public void addCar(@RequestBody Car car) {
//		// do something to save the car object in the database
//	}
	
//	@GetMapping("/example/car")
//	public String getCar(Model model, @ModelAttribute("foo") String foo) {
//		model.addAttribute("isValid", true);
//		model.addAttribute("ourCar", exampleService.getCar());
//		return "exampleCar";
//	}
	
//	@GetMapping("/example/car/redirect")
//	public String getRedirect(Model model) {
//		model.addAttribute("foo", "bar");
//		return "redirect:/example/car";
//	}

//	@GetMapping("/example/car/redirect/attr")
//	public String getRedirectWithAttributes(Model model, RedirectAttributes attributes) {
//		attributes.addFlashAttribute("foo", "bar");
//		return "redirect:/example/car/redirect/example";
//	}
	
//	@GetMapping("/example/car/redirect/example")
//	public String getRedirectWithAttributes(@ModelAttribute("foo") String foo) {
//		return "exampleCar";
//	}
	
}
