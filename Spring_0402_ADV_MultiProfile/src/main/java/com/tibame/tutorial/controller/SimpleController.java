package com.tibame.tutorial.controller;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	
	@Autowired
	DataSource dataSource;
	
	@GetMapping("/datasource")
	public String datasource(Model model) {
		model.addAttribute("driver", driver);
		model.addAttribute("url", url);
		model.addAttribute("username", userName);
		model.addAttribute("password", password);
		return "datasource";
	}
	
}
