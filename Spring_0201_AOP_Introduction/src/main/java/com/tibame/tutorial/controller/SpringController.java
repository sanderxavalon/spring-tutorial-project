package com.tibame.tutorial.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tibame.tutorial.beans.*;

@Controller
public class SpringController {
	
	@Autowired
	PaymentService paymentService;
	
	@Autowired
	LoginService loginService;
	
	@Autowired
	MemberService memberService;
	
	@GetMapping("/index")
	public ModelAndView callAllFunction() {
		
		paymentService.pay();
		loginService.login();
		memberService.addService();
		
		return new ModelAndView("response", "message", "呼叫所有方法，請看Console");

	}

}
