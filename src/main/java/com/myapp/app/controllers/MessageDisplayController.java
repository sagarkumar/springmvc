package com.myapp.app.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MessageDisplayController {

	@GetMapping("/hello")
	public String sayHello(Model model) {
		model.addAttribute("name","sagar");
		return "home";
	}

	
}
