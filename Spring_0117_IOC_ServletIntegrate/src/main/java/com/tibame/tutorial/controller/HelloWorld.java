package com.tibame.tutorial.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import com.tibame.tutorial.beans.Car;

public class HelloWorld extends HttpServlet {

	@Autowired
	Car car;
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("Car", car);
		req.getRequestDispatcher("/WEB-INF/jsp/helloworld.jsp").forward(req, resp);
	}
	
	

}
