package com.tibame.lab.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tibame.lab.constructor.beans.Burger;


public class App {
    
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-lab-constructor.xml");
		
		Burger burger = (Burger) context.getBean("bigBurger");
		
		if(burger.getLettuce() == null) {
			System.out.println("Fix your xml and get me a burger.");
			return;
		}
		
		if(!burger.getCheeseOnTop().getType().equals("Cheddar")) {
			System.out.println("Fix your xml and get me a burger.");
			return;
		}
		
		if(!burger.getCheeseOnBottom().getType().equals("Cottage")) {
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
