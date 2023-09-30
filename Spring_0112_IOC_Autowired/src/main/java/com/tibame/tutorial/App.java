package com.tibame.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tibame.tutorial.beans.Car;

public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-tutorial.xml");
		
		System.out.println(context.getBean(Car.class).toString());
		
	}

}
