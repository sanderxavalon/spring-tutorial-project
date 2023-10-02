package com.tibame.lab;

import org.springframework.beans.factory.support.DefaultSingletonBeanRegistry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tibame.lab.beans.BenzCar;
import com.tibame.lab.beans.MessageReceiver;
import com.tibame.lab.beans.tire.BMWTire;
import com.tibame.lab.beans.tire.BenzTire;

public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-lab.xml");
		
		var benzcar = context.getBean(BenzCar.class);
		if (!(benzcar.getTireA() instanceof BenzTire)) {
			System.out.println("GO FIX YOUR XML!");
			return;
		}
		
		if (!(benzcar.getTireB() instanceof BMWTire)) {
			System.out.println("GO FIX YOUR XML!");
			return;
		}
		
	    DefaultSingletonBeanRegistry registry = (DefaultSingletonBeanRegistry) context.getAutowireCapableBeanFactory();
	    registry.destroySingleton("benzCar");
	    
	    MessageReceiver.validate();
		
	}

}
