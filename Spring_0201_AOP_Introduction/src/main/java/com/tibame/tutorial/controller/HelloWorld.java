package com.tibame.tutorial.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.tibame.tutorial.beans.*;

@Controller
public class HelloWorld {
	
	@Autowired
	PaymentService paymentService;
	
	@Autowired
	LoginService loginService;
	
	@Autowired
	MemberService memberService;
	
	@GetMapping("/helloworld")
	public void helloworld(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		paymentService.pay();
		loginService.login();
		memberService.addService();
		
		PrintWriter out = response.getWriter();
		out.write("OK");		
		
	}

}
