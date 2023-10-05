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
import com.tibame.tutorial.dao.HibernateService;

public class Controller extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
		HibernateDAO dao = context.getBean(HibernateDAO.class);
		HibernateService service = context.getBean(HibernateService.class);
		resp.setContentType("application/json; charset=UTF-8");
		PrintWriter writer = resp.getWriter();

		var action = req.getParameter("action");
		if("saveTimeOut".equals(action)) {
			dao.saveTimeOut();
			writer.write(new Gson().toJson("OK"));
		}
		else if ("noReadOnly".equals(action)) {
			dao.getAllNoReadOnly();
			writer.write(new Gson().toJson("OK"));
		}
		else if ("readOnly".equals(action)) {
			dao.getAll();
			writer.write(new Gson().toJson("OK"));
		}
		else if ("saveWithRuntimeException".equals(action)) {
			dao.saveWithRuntimeException();
			writer.write(new Gson().toJson("OK"));
		}
		else if ("saveNoRollBack".equals(action)) {
			dao.saveNoRollBack();
			writer.write(new Gson().toJson("OK"));
		}
		else if ("saveRollBackFor".equals(action)) {
			dao.saveRollBackFor();
			writer.write(new Gson().toJson("OK"));
		}
		else if ("saveAll".equals(action)) {
			service.saveAll();
			writer.write(new Gson().toJson("OK"));
		}
		else {
			writer.write(new Gson().toJson(dao.getAll()));
		}
	}
	
}
