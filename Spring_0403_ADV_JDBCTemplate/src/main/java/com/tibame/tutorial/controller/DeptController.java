package com.tibame.tutorial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tibame.tutorial.dao.DeptDAO;

@RestController
public class DeptController {

	@Autowired
	DeptDAO dao;
	
	@RequestMapping(path = "/index")
	public Integer getCount() {
		return dao.findOne();
	}

}
