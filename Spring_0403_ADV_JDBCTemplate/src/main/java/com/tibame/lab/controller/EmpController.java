package com.tibame.lab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tibame.lab.service.EmpService;

@Controller
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired(required = false)
	EmpService empService;

	
	@RequestMapping("getAll")
	public ModelAndView getAll() {
		empService.getAll();
		return null;
	}
}
