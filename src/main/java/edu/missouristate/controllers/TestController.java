package edu.missouristate.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.missouristate.services.TestService;
import edu.missouristate.util.ModelHelper;

@Controller
public class TestController {
	
	@Autowired
	TestService testService;
	
    @GetMapping(value = { "/examplemvc" })
    public String getDemoPage(HttpServletRequest request, HttpSession session, Model model, 
    		@RequestParam(value = "id",required = false) String id, 			// Query Parameter - id
    		@RequestParam(value = "password",required = false) String password,	// Query Parameter - password
    		@ModelAttribute("messageType") final String messageType,			// Redirect messageType passed in ModelAttribute
    		@ModelAttribute("messageBody") final String messageBody) {			// Redirect messageBody passed in ModelAttribute
    	
    	// Redirect Model Messages
    	if (messageBody != null && messageBody.length() > 0) {
    		ModelHelper.addMessageToModel(model, messageType, messageBody);	
    	}
    	
    	// Check if no id and password was passed in as Query Parameters
    	if (id == null && password == null) {
    		return "example";
    	}
    	
    	// Check if credentials passed in are good
    	boolean isAuthenticated = testService.isAuthenticated(id, password);
    	
    	// If authenticated, redirect to the dashboard. 
    	// Otherwise provide a message and reload the Example view
    	if (isAuthenticated) {
    		session.setAttribute("authenticated", "true");
    		return "redirect:/dashboard";
    	} else {
    		model.addAttribute("message", "Sorry, invalid credentials");
    		return "example";
    	}
    }

	@GetMapping("/dashboard")
	public String getHome(HttpSession session, Model model, final RedirectAttributes redirectAttributes) {
		
		if (session.getAttribute("authenticated") != null) {
			ModelHelper.addMessageToModel(model, ModelHelper.MESSAGE_TYPE_SUCCESS, "Welcome to the Dashboard!");
			model.addAttribute("customMessage", "You have been authenticated successfully.");
			return "dashboard";	
		} else {
			ModelHelper.addFlashMessageToModel(redirectAttributes, ModelHelper.MESSAGE_TYPE_ERROR, 
					"Sorry, you cannot access the dashboard until you have been authenticated.");
			return "redirect:/examplemvc";
		}
	}
	
	@PostMapping("/checkCredentials")
	public String postCheckCredentials(HttpSession session, Model model,
			@RequestParam(value = "id",required = false) String id, 
    		@RequestParam(value = "password",required = false) String password) {
		
		if (session.getAttribute("authenticated") != null) {
			boolean isAuthenticated = testService.isAuthenticated(id, password);
			
			if (isAuthenticated) {
				ModelHelper.addMessageToModel(model, ModelHelper.MESSAGE_TYPE_SUCCESS, "Good Credentials!");
			} else {
				ModelHelper.addMessageToModel(model, ModelHelper.MESSAGE_TYPE_ERROR, "Bad Credentials!");
			}
			
			return "dashboard";	
		} else {
			ModelHelper.addMessageToModel(model, ModelHelper.MESSAGE_TYPE_ERROR, 
					"Sorry, couldn't check your credentials since your session timed out.");
			return "redirect:/examplemvc";
		}
	}
	
}
