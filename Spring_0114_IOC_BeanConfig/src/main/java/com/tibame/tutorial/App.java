package com.tibame.tutorial;

import com.google.gson.Gson;
import com.tibame.tutorial.beans.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.weaving.DefaultContextLoadTimeWeaver;
import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Configuration
@ComponentScan(basePackages = "com.tibame.tutorial")
public class App {
	
	public static void main(String[] args) {
		
	    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
	    
	    System.out.println(new Gson().toJson(context.getBean("datasource")));
	    
	}
}