package com.tibame.tutorial;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.tibame.tutorial.beans.NormalBean;

public class HelloWorld extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		WebApplicationContext ctx = WebApplicationContextUtils.getRequiredWebApplicationContext(this.getServletContext());
		var bean = (NormalBean) ctx.getBean(request.getParameter("bean"));

		switch (request.getParameter("action")) {
			case "speak": {
				bean.speakBeanName();
				break;
			}
			case "bye": {
				bean.byebye();
				break;
			}
			case "returnname": {
				bean.returnBeanName();
				break;
			}
			case "throwerror": {
				bean.throwError();
				break;				
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + request.getParameter("action"));
		}
		PrintWriter out = response.getWriter();
		out.write("OK");
	}
}
