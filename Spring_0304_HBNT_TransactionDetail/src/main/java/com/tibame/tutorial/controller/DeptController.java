package com.tibame.tutorial.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
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
		deptService.getAll();
		return new ModelAndView("response", "message", "處理完成");
	}

	@GetMapping("/getAllWithoutReadOnly")
	public ModelAndView getAllNoReadOnly() {
		deptService.getAllNoReadOnly();
		return new ModelAndView("response", "message", "處理完成");
	}

	@GetMapping("/saveTimeOut")
	public ModelAndView saveTimeOut() {
		deptService.saveTimeOut();
		return new ModelAndView("response", "message", "處理完成");
	}

	@GetMapping("/saveWithRuntimeException")
	public ModelAndView saveWithRuntimeException() {
		deptService.saveWithRuntimeException();
		return new ModelAndView("response", "message", "處理完成");
	}

	@GetMapping("/saveNoRollBack")
	public ModelAndView saveNoRollBack() {
		deptService.saveNoRollBack();
		return new ModelAndView("response", "message", "處理完成");
	}
	
	@GetMapping("/exceptionNoRollBack")
	public ModelAndView exceptionNoRollBack() throws IOException {
		deptService.exceptionNoRollBack();
		return new ModelAndView("response", "message", "處理完成");
	}
	
	@GetMapping("/saveRollBackFor")
	public ModelAndView saveRollBackFor() throws IOException {
		deptService.saveRollBackFor();
		return new ModelAndView("response", "message", "處理完成");
	}

	@GetMapping("/propagation")
	public ModelAndView saveAll() {
		deptService.saveAll();
		return new ModelAndView("response", "message", "處理完成");
	}
	
	@ExceptionHandler(RuntimeException.class)
	public ModelAndView nullIntercept(Exception ex) {
		return new ModelAndView("response", "message", "攔截RuntimeException: " + ex.getMessage());
	}
	
	@ExceptionHandler(IOException.class)
	public ModelAndView IOnullIntercept(Exception ex) {
		return new ModelAndView("response", "message", "攔截IOException");
	}

}