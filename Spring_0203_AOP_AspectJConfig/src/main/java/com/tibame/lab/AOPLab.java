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
