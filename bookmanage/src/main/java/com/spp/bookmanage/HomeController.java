package com.spp.bookmanage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home(Model model) {
		
		return "home";
	}
	
	@RequestMapping("/success")
	public String success(Model model) {
		
		return "success";
	}
	
	@RequestMapping("/fail")
	public String fail(Model model) {
		
		return "fail";
	}
	
}
