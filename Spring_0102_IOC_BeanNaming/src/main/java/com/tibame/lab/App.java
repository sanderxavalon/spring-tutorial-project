package com.tibame.lab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tibame.lab.beans.FrenchFry;
import com.tibame.lab.beans.Hamburger;

public class App {
	
	// 題目說明：
	// 依照底下的要求來對Bean進行配置
	// 記得要注意看FrenchFry有兩個if條件喔
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-lab.xml");
		
		// 要注意BeanID喔
		Object humburger = context.getBean("hambaga");
		
		if (humburger instanceof Hamburger) {
			((Hamburger) humburger).callHamburger();;
		}
		
		FrenchFry frenchFry = (FrenchFry) context.getBean("frenchfry");
			
		if (frenchFry instanceof FrenchFry) {
			((FrenchFry) frenchFry).callFrenchFry();
		}
		
		// 要注意這個Bean需要第二個名字
		FrenchFry frenchFryByName = (FrenchFry) context.getBean("myfavorite");
		
		if (frenchFryByName  instanceof FrenchFry) {
			System.out.println("French Fry is my favorite!");
		}
		
	}

}
