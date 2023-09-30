package com.tibame.tutorial.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.tibame.tutorial.dao.HibernateDAO;

public class Controller extends HttpServlet {
	
	Logger logger= LoggerFactory.getLogger(getClass());

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
		HibernateDAO dao = context.getBean(HibernateDAO.class);
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter writer = resp.getWriter();
		if(dao.getAll() == null || dao.getAll().isEmpty()) {
			writer.write("problem");
		}
		dao.getAll().stream().forEach((x) -> {
			writer.write(x.toStringWithEmp());
		});
	}
	
}
