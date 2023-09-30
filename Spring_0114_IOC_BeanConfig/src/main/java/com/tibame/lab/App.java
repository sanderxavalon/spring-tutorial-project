package com.tibame.lab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.tibame.lab.beans.Burger;

@Configuration
@ComponentScan(basePackages = "com.tibame.lab")
public class App {
    
	public static void main(String[] args) throws InterruptedException {
		
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        
        System.out.println(context.getBean(Burger.class).toString());
	}
}
