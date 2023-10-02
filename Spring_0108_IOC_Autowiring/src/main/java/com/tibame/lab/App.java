package com.tibame.lab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tibame.lab.beans.BenzCar;
import com.tibame.lab.beans.MazdaCar;
import com.tibame.tutorial.beans.BeanA;
import com.tibame.tutorial.beans.BeanB;
import com.tibame.tutorial.beans.BeanC;

public class App {
    
	public static void main(String[] args) throws InterruptedException {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-lab.xml");
		
		var benz = context.getBean(BenzCar.class);
		
		if (!"BenzTire".equals(benz.getTire().toString())) {
			System.out.println("GO FIX YOUR XML!");
			return;
		}
		
		var mazda = context.getBean(MazdaCar.class);
		
		if (!"MazdaTire".equals(mazda.getMazdaTire().toString())) {
			System.out.println("GO FIX YOUR XML!");
			return;
		}
		
		System.out.println("You make it!");

		
		
	}
}