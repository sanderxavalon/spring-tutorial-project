package com.tibame.lab.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.google.gson.Gson;
import com.tibame.lab.dao.LabHibernateDAO;

public class Controller extends HttpServlet {
	
	// 題目說明:
	// 接下來麻煩用EMP 與 Hibernate Session做增刪改查
	// 連線已經與設定幫各位設定好了，如果想要用Mysql自己試試看的話，需要更換配置喔
	// 雖然都幫你配好了，但是啟動Lab前要把Web.xml轉換到lab的AppConfig才會吃到設定喔．
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
		LabHibernateDAO dao = context.getBean(LabHibernateDAO.class);
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
		else {
			writer.write(new Gson().toJson(dao.getAll()));
		}
	}
	
}
