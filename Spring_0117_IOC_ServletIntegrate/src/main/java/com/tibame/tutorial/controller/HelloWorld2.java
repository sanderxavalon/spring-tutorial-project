package com.tibame.tutorial.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.tibame.tutorial.beans.Car;

public class HelloWorld2 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
		Car car = context.getBean(Car.class);
		req.setAttribute("Car", car);
		req.getRequestDispatcher("/WEB-INF/jsp/helloworld2.jsp").forward(req, resp);
	}
	
	
}
