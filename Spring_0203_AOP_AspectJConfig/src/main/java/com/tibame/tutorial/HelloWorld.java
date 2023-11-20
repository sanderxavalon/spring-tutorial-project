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
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		var bean = (NormalBean) ctx.getBean(request.getParameter("bean"));

		switch (request.getParameter("action")) {
			case "speak": {
				bean.speakBeanName();
				out.write("呼叫Speak，請看Console");
				break;
			}
			case "bye": {
				bean.byebye();
				out.write("呼叫bye，請看Console");
				break;
			}
			case "returnname": {
				bean.returnBeanName();
				out.write("呼叫returnname，請看Console");
				break;
			}
			case "throwerror": {
				bean.throwError();
				out.write("呼叫throwerror，請看Console");
				break;				
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + request.getParameter("action"));
		}
	}
}
