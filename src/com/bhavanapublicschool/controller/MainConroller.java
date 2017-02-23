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
}
