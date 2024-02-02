package com.tibame.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.tibame.service.DeptService;

@Controller
public class DeptController {
	
	@Autowired
	DeptService deptService;

	@RequestMapping("/index")
	public ModelAndView index() {
		return new ModelAndView("index", "dept", deptService.getAll());
	}

}
