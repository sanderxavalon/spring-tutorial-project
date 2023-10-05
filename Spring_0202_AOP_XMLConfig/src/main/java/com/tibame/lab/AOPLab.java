package com.tibame.lab;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.tibame.lab.beans.car.Car;

public class AOPLab extends HttpServlet {

	// 題目說明:
	// 接下來我們要自己用XML配置AOP功能
	// Benz, Mazda, BMW都有依樣的方法，所以AOP Pointcut只要對應攔截就可以了
	// 注意web.xml的配置需要提前更換喔
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		WebApplicationContext ctx = WebApplicationContextUtils.getRequiredWebApplicationContext(this.getServletContext());
		var car = (Car) ctx.getBean(request.getParameter("bean"));

		switch (request.getParameter("action")) {
			case "drive": {
				car.drive();
				break;
			}
			case "getout": {
				car.getOutCar();
				break;
			}
			case "show": {
				car.showCarName();
				break;
			}
			case "bang": {
				car.bang();
				break;				
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + request.getParameter("action"));
		}
		PrintWriter out = response.getWriter();
		out.write("OK");
	}
}
