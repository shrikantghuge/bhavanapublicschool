package com.studyeasy.controller;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.studyeasy.bean.GalleryBean;
import com.studyeasy.bean.NewsAndEventBean;
import com.studyeasy.service.MainUIService;
import com.studyeasy.service.MainUIServiceImpl;

@Controller
public class MainConroller {
	static Logger LOGGER = Logger.getLogger(MainConroller.class);
	private MainUIService mainUIService = new MainUIServiceImpl();
	
	@RequestMapping("/")
	public String getHomePage(Model model){
		LOGGER.info("First page is initializing ");
		/*try {
			List<GalleryBean> images = mainUIService.getSliderImages();
			model.addAttribute("images", images);
		} catch (SQLException e) {
			e.printStackTrace();
		}*/
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
	
	@RequestMapping("newsnevents")
	public String newsneventssPageResolver(Model model){
		LOGGER.info("newsnevents getting loaded");
		try{
			List<NewsAndEventBean> news =  mainUIService.getNewsEvents();
			model.addAttribute("news", news);
		}catch(Exception e){
			model.addAttribute("error", "error");
		}
		return "newsandevents";
	}
	
	@RequestMapping("newsdetails")
	public String newsneventssDetails(){
		
		LOGGER.info("news events details getting loaded");
		return "newsdetails";
	}
	
	
}
