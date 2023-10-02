package com.tibame.lab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tibame.lab.beans.Burger;

public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-lab.xml");
		
		Burger burger = (Burger) context.getBean("burger");
		
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
