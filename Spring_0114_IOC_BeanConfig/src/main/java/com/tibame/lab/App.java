package com.tibame.lab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tibame.lab.beans.Burger;

public class App {
    
	public static void main(String[] args) {
		
	    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
	    
	    var burger = context.getBean(Burger.class);
	    
	    if (!"Cheddar".equals(burger.getCheeseType())) {
			System.out.println("GO FIX YOUR CONFIGURATION!");
			return;
		}
	    
	    if (burger.getSize() !=  10) {
			System.out.println("GO FIX YOUR CONFIGURATION!");
			return;
		}
	    
	    if (burger.getPrice() !=  19.99) {
			System.out.println("GO FIX YOUR CONFIGURATION!");
			return;
		}
	    
	    System.out.println("You make it!");
		
	}
}
