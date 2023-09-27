package com.tibame.lab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tibame.lab.beans.FrenchFry;
import com.tibame.lab.beans.Hamburger;

public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-lab.xml");
		
		Object humburger = context.getBean("hambaga");
		
		if (humburger instanceof Hamburger) {
			((Hamburger) humburger).callHamburger();;
		}
		
		FrenchFry frenchFry = (FrenchFry) context.getBean("frenchfry");
			
		if (frenchFry instanceof FrenchFry) {
			((FrenchFry) frenchFry).callFrenchFry();
		}
		
		FrenchFry frenchFryByName = (FrenchFry) context.getBean("myfavorite");
		
		if (frenchFryByName  instanceof FrenchFry) {
			System.out.println("French Fry is my favorite!");
		}
		
	}

}
