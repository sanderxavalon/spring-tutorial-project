package com.tibame.lab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tibame.lab.byname.*;
import com.tibame.lab.bytype.*;
import com.tibame.lab.contructor.*;

public class App {
    
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-lab.xml");
		
		var benz = context.getBean(BenzCar.class);
		
		benz.getTire().run();
		
		System.out.println("Benz配置成功");
	
		var mazda = context.getBean(MazdaCar.class);
		
		mazda.getTire().run();
		
		System.out.println("Mazda配置成功");
		
		var bmw = context.getBean(BMWCar.class);
		
		bmw.getNormalTire().run();
		
		System.out.println("BMW配置成功");
		
		System.out.println("所有配置成功！");
		
	}
}