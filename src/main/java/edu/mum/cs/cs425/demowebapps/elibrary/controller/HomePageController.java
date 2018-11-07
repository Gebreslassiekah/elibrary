package edu.mum.cs.cs425.demowebapps.elibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {

	@RequestMapping(value = { "/", "/elibrary", "/elibrary/home" })

	public String desplayHomePage() {
		return "home/index";
	}

}
