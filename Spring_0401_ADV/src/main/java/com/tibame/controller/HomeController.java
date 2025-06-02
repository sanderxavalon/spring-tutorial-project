package com.tibame.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tibame.service.DeptService;

@Controller
public class HomeController {

	@Autowired
	DeptService deptService;
	
    @GetMapping("/")
    public ModelAndView home() {
		return new ModelAndView("GetAllDept", "dept", deptService.getAll());
    }
}