package com.bhavanapublicschool.controller;

import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bhavanapublicschool.service.MainUIService;
import com.bhavanapublicschool.service.MainUIServiceImpl;

@Controller
public class MainConroller {
	static Logger LOGGER = Logger.getLogger(MainConroller.class);
	private MainUIService mainUIService = new MainUIServiceImpl();
	
	@RequestMapping("/")
	public String getHomePage(){
		LOGGER.info("First page is initializing ");
		try {
			mainUIService.getSliderImages();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "index";		
	}
	@RequestMapping("gallery")
	public String galleryPageResolver(){
		LOGGER.info("gallery getting loaded");
		return "gallery";
	}
	@RequestMapping("extra")
	public String extraPageResolver(){
		LOGGER.info("gallery getting loaded");
		return "extra";
	}
	@RequestMapping("facilities")
	public String facilitiesPageResolver(){
		LOGGER.info("gallery getting loaded");
		return "facilities";
	}
	@RequestMapping("aboutus")
	public String aboutusPageResolver(){
		LOGGER.info("gallery getting loaded");
		return "aboutus";
	}
	
}
