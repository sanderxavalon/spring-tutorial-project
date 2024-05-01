package com.tibame.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tibame.tutorial.service.DeptService;
import com.tibame.tutorial.vo.Dept;

@Controller
@RequestMapping("dept")
public class DeptController {
	
	@Autowired
	DeptService deptService;
	
	@GetMapping("/getAll")
	public ModelAndView getAll() {
		return new ModelAndView("tutorial/GetAllDept", "dept", deptService.getAll());
	}
		
	@GetMapping("/insertPage")
	public String insertPage() {
		return "tutorial/InsertOrUpdate";
	}
	
	@GetMapping("/getOneForUpdatePage/{id}")
	public ModelAndView getOneForUpdate(@PathVariable("id") Integer id) {
		return new ModelAndView("tutorial/InsertOrUpdate", "dept", deptService.getOne(id));
	}
	
	@PostMapping("/insert")
	public String insert(Dept dept) {
		deptService.insert(dept);
		return "redirect:/dept/getAll";
	}
	
	@PostMapping("/update")
	public String update(Dept dept) {
		deptService.update(dept);
		return "redirect:/dept/getAll";
	}
	
	@PostMapping("/delete/{id}")
	public String delete(@PathVariable("id") Integer id) {
		deptService.delete(id);
		return "redirect:/dept/getAll";
	}

}