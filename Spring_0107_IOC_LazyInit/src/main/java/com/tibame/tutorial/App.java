package com.tibame.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tibame.tutorial.beans.BeanA;

public class App {
    
	public static void main(String[] args) throws InterruptedException {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-tutorial.xml");
		
		for(int i = 1; i <= 3; i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		
		var beanA = context.getBean(BeanA.class);
		
	}
}
