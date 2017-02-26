package com.bhavanapublicschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainConroller {
	
	@RequestMapping("/")
	public String getHomePage(){
		System.out.println("First page is initializing ");
		return "index";		
	}
	@RequestMapping("gallery")
	public String galleryPageResolver(){
		System.out.println("gallery getting loaded");
		return "gallery";
	}
	@RequestMapping("extra")
	public String extraPageResolver(){
		System.out.println("gallery getting loaded");
		return "extra";
	}
	@RequestMapping("facilities")
	public String facilitiesPageResolver(){
		System.out.println("gallery getting loaded");
		return "facilities";
	}
	@RequestMapping("aboutus")
	public String aboutusPageResolver(){
		System.out.println("gallery getting loaded");
		return "aboutus";
	}
	
}
