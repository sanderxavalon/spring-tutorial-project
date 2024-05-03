package com.tibame.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[]{ SpringiocConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[]{
				SpringmvcConfig.class
		};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}
	
//	@Override
//	public void onStartup(ServletContext servletContext) throws ServletException {
//        servletContext.setInitParameter("spring.profiles.active", "prod");
//		super.onStartup(servletContext);
//	}
	
}
