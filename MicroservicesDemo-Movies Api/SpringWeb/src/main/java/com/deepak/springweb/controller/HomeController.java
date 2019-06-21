package com.deepak.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/home")
	@ResponseBody
	public String getHome() {
		System.out.println("Hi this is the home controller");
		return "home";
	}
	
//	@RequestMapping
//	public String getLogout() {
//		System.out.println("Hi this is the logout controller");
//		return "logout";
//	}
}
