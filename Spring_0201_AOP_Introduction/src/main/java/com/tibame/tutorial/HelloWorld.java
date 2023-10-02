package com.tibame.tutorial;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.tibame.tutorial.beans.*;

public class HelloWorld extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		WebApplicationContext ctx = WebApplicationContextUtils.getRequiredWebApplicationContext(this.getServletContext());
		var paymentService = ctx.getBean(PaymentService.class);
		var loginService = ctx.getBean(LoginService.class);
		var memberService = ctx.getBean(MemberService.class);
		
		paymentService.pay();
		loginService.login();
		memberService.addService();
		
		PrintWriter out = response.getWriter();
		out.write("OK");
	}
}
