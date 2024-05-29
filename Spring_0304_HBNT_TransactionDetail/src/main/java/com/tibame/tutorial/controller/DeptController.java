package com.tibame.tutorial.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tibame.tutorial.service.DeptService;
import com.tibame.tutorial.service.TransactionDetailService;

@Controller
@RequestMapping("dept")
public class DeptController {
	
	@Autowired
	DeptService deptService;
	
	@Autowired
	TransactionDetailService transactionDetailService;

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
	
	@GetMapping("/propagation/required")
	public ModelAndView required() {
		transactionDetailService.REQUIRED();
		return new ModelAndView("response", "message", "REQUIRED處理完成");
	}
	
	@GetMapping("/propagation/required2")
	public ModelAndView required2() {
		transactionDetailService.REQUIRED2();
		return new ModelAndView("response", "message", "REQUIRED處理完成");
	}
	
	@GetMapping("/propagation/requirednew")
	public ModelAndView requirednew() {
		transactionDetailService.REQUIRESNEW();
		return new ModelAndView("response", "message", "REQUIRESNEW處理完成");
	}
	
	@GetMapping("/propagation/never")
	public ModelAndView never() {
		transactionDetailService.NEVER();
		return new ModelAndView("response", "message", "NEVER處理完成");
	}
	
	@GetMapping("/propagation/mandatory")
	public ModelAndView mandatory() {
		transactionDetailService.MANDATORY();
		return new ModelAndView("response", "message", "MANDATORY處理完成");
	}
	
	@GetMapping("/propagation/support")
	public ModelAndView support() {
		transactionDetailService.SUPPORT();
		return new ModelAndView("response", "message", "SUPPORT處理完成");
	}
	
	@GetMapping("/propagation/notsupport")
	public ModelAndView notsupport() {
		transactionDetailService.NOTSUPPORTED();
		return new ModelAndView("response", "message", "NOTSUPPORTED處理完成");
	}
	
	@GetMapping("/propagation/nest1")
	public ModelAndView NEST1() {
		transactionDetailService.NEST1();
		return new ModelAndView("response", "message", "NEST1處理完成");
	}
	
	@GetMapping("/propagation/nest2")
	public ModelAndView NEST2() {
		transactionDetailService.NEST2();
		return new ModelAndView("response", "message", "NEST2處理完成");
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