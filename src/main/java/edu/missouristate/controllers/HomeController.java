package edu.missouristate.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {
	
	@ResponseBody
	@GetMapping(value = {"/devicestring"})
	public String getDeviceString(Model model) throws Exception {
		return "Device ID goes here";
	}
	
	@GetMapping("/device")
	public String getDeviceTable(Model model, HttpServletRequest request, HttpSession session) {
		return "deviceTable";
	}
	
	@GetMapping("/devicer")
	public String getDevices(Model model, HttpServletRequest request, HttpSession session) {
		return "deviceTable";
	}
	
	
	
}
