package com.tibame.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tibame.service.DeptService;
import com.tibame.vo.Dept;

@Controller
@RequestMapping("dept")
public class DeptController {
	
	@Autowired
	DeptService deptService;
		
	@GetMapping("/insertPage")
	public String insertPage() {
		return "InsertOrUpdate";
	}
	
	@GetMapping("/getOneForUpdatePage/{id}")
	public ModelAndView getOneForUpdate(@PathVariable("id") Integer id) {
		return new ModelAndView("InsertOrUpdate", "dept", deptService.getOne(id));
	}
	
	@PostMapping("/insert")
	public String insert(Dept dept) {
		deptService.insert(dept);
		return "redirect:/";
	}
	
	@PostMapping("/update")
	public String update(Dept dept) {
		deptService.update(dept);
		return "redirect:/";
	}
	
	@PostMapping("/delete/{id}")
	public String delete(@PathVariable("id") Integer id) {
		deptService.delete(id);
		return "redirect:/";
	}

}