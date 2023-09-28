package com.tibame.tutorial.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tibame.tutorial.setter.beans.Car;

public class App {
    
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-tutorial-setter.xml");
		
		Car car = context.getBean(Car.class);
		
		System.out.println(car.toString());
		
	}
}