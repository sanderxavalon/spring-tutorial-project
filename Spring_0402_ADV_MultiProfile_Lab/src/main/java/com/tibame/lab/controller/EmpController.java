package com.tibame.lab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tibame.lab.service.EmpService;
import com.tibame.lab.vo.Emp;

@Controller
@RequestMapping("emp")
public class EmpController {
	
	@Autowired(required = false)
	EmpService empService;
	
	@GetMapping("/getAll")
	public ModelAndView getAll() {
		return new ModelAndView("lab/GetAllDept", "emp", empService.getAll());
	}
		
	@GetMapping("/insertPage")
	public String insertPage() {
		return "lab/InsertOrUpdate";
	}
	
	@GetMapping("/getOneForUpdatePage/{id}")
	public ModelAndView getOneForUpdate(@PathVariable("id") Integer id) {
		return new ModelAndView("lab/InsertOrUpdate", "emp", empService.getOne(id));
	}
	
	@PostMapping("/insert")
	public String insert(Emp emp) {
		empService.insert(emp);
		return "redirect:/emp/getAll";
	}
	
	@PostMapping("/update")
	public String update(Emp emp) {
		empService.update(emp);
		return "redirect:/emp/getAll";
	}
	
	@PostMapping("/delete/{id}")
	public String delete(@PathVariable("id") Integer id) {
		empService.delete(id);
		return "redirect:/emp/getAll";
	}

}