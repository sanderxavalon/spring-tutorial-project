package com.tibame.lab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tibame.lab.beans.BeanA;
import com.tibame.lab.beans.MessageReceiver;

public class App {
    
	public static void main(String[] args) throws InterruptedException {
		
		var thread = new Thread(new MessageReceiver());
		
		thread.run();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-lab.xml");
		
		Thread.sleep(3000);
		
		var beanA = context.getBean(BeanA.class);
		
		System.out.println("Finish!");
		
	}
}
