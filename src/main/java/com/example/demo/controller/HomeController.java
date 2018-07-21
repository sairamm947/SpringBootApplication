package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {
	
	private Logger log = LoggerFactory.getLogger(getClass());
	
	@RequestMapping("/")
	public String home() {
		//model.put("message", "HowToDoInJava Reader !!");
		return "index";
	}
	
	@RequestMapping("home")
	public ModelAndView greetings() {
		log.info("Home Controller Called.....");
		ModelAndView mav=new ModelAndView("home");
		return mav;
	}
}
