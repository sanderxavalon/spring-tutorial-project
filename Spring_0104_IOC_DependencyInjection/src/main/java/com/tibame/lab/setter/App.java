package com.tibame.lab.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tibame.lab.setter.beans.Burger;

public class App {
    
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-lab-setter.xml");
		
		Burger burger = (Burger) context.getBean("bigBurger");
		
		if(burger.getLettuce() == null) {
			System.out.println("Fix your xml and get me a burger.");
			return;
		}
		
		if(burger.getCheeseOnTop().getType() != "Cheddar") {
			System.out.println("Fix your xml and get me a burger.");
			return;
		}
		
		if(burger.getCheeseOnBottom().getType() != "Cottage") {
			System.out.println("Fix your xml and get me a burger.");
			return;
		}
		
		if(burger.getTomato().getSize() != 10) {
			System.out.println("Fix your xml and get me a burger.");
			return;
		}
		
		System.out.println("Wow, that's a great burger.");
	}
}
