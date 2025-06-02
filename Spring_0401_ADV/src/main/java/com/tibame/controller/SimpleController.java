package com.tibame.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleController {
	
	@Value("${database.driver}")
	private String driver;
	@Value("${database.url}")
	private String url;
	@Value("${database.username}")
	private String userName;
	@Value("${database.password}")
	private String password;
	
	@GetMapping("/datasource")
	public String datasource(Model model) {
		model.addAttribute("driver", driver);
		model.addAttribute("url", url);
		model.addAttribute("username", userName);
		model.addAttribute("password", password);
		return "datasource";
	}
	
}
