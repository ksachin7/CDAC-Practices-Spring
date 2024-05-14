package com.example.jpa.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ThymeController {

	@SuppressWarnings("deprecation")
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about(Model model) {
		System.out.println("Inside about handler.");
		model.addAttribute("name", "Sachin-Kumar");
		model.addAttribute("Company", "Food-delivery");
		model.addAttribute("currentDate", new Date().toLocaleString());
		return "about";
	}

	@RequestMapping(value = "/index")
	public String iterateHandler(Model m) {
		List<String> nameList = List.of("Ankit", "Laxmi", "Rohan", "Karan");
		m.addAttribute("name", "Someone");
		m.addAttribute("nameList", nameList);
		return "index";
	}

	@RequestMapping(value = "/conditional")
	public String conditional(Model m) {
		m.addAttribute("isActive", true);
		m.addAttribute("gender", "F");

		List<Integer> ints = List.of(22, 34, 36, 76);
		m.addAttribute("integers", ints);

		return "conditional";
	}

	@RequestMapping(value = "/base")
	public String base(Model m) {
		return "NewFile";
	}
}
