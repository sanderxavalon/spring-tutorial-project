package com.tibame.tutorial.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.google.gson.Gson;
import com.tibame.tutorial.dao.HibernateDAO;

public class Controller extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
		HibernateDAO dao = context.getBean(HibernateDAO.class);
		resp.setContentType("application/json; charset=UTF-8");
		PrintWriter writer = resp.getWriter();

		var action = req.getParameter("action");
		if("save".equals(action)) {
			dao.save();
			writer.write(new Gson().toJson("OK"));
		}
		else if ("update".equals(action)) {
			dao.update();
			writer.write(new Gson().toJson("OK"));
		}
		else if ("delete".equals(action)) {
			dao.delete();
			writer.write(new Gson().toJson("OK"));
		}
		else if ("savefail".equals(action)) {
			dao.saveFail();
			writer.write(new Gson().toJson("OK"));
		} 
		else {
			writer.write(new Gson().toJson(dao.getAll()));
		}
	}
	
}
