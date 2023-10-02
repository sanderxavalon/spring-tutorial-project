package com.tibame.lab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tibame.lab.beans.BMWCar;
import com.tibame.lab.beans.BenzCar;
import com.tibame.tutorial.beans.BeanA;

public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-lab.xml");
		
		var benzCar1 =  context.getBean(BenzCar.class);
		
		var benzCar2 =  context.getBean(BenzCar.class);
		
		System.out.println("Benz1:" + benzCar1.hashCode());
		System.out.println("Benz2:" + benzCar2.hashCode());
		
		if (benzCar1 != benzCar2) {
			System.out.println("GO FIX YOUR XML!");
			return;
		}
		
		var bmwCar1 =  context.getBean(BMWCar.class);
		
		var bmwCar2 =  context.getBean(BMWCar.class);
		
		System.out.println("BMW1:" + bmwCar1.hashCode());
		System.out.println("BMW2:" + bmwCar2.hashCode());

		if (bmwCar1 == bmwCar2) {
			System.out.println("GO FIX YOUR XML!");
			return;
		}
		
		System.out.println("You make it!");

	}

}
