package edu.missouristate.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.missouristate.util.ModelHelper;


@Controller
public class LoginController {

	@GetMapping("/logout")
	public String getLogout(HttpSession session, Model model) {
		session.setAttribute("authenticated", null);
		ModelHelper.addMessageToModel(model, ModelHelper.MESSAGE_TYPE_SUCCESS,
				"You have been logged out successfully!");
		return "example";
	}
	
}
