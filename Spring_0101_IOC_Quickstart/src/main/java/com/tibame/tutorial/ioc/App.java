package com.tibame.tutorial.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tibame.tutorial.ioc.benzImpl.BenzCar;

public class App {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-ioc.xml");
		BenzCar car = (BenzCar) context.getBean("car");
		car.drive();
	}

}
