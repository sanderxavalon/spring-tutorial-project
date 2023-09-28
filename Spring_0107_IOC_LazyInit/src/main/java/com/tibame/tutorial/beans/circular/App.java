package com.tibame.tutorial.beans.circular;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    
	public static void main(String[] args) throws InterruptedException {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-tutorial.xml");
		
		var beanB = context.getBean(BeanB.class);
	
	}
}
