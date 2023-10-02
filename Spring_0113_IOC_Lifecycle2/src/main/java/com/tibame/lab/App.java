package com.tibame.lab;

import org.springframework.beans.factory.support.DefaultSingletonBeanRegistry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tibame.lab.beans.MessageReceiver;

public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-lab.xml");
		
	    DefaultSingletonBeanRegistry registry = (DefaultSingletonBeanRegistry) context.getAutowireCapableBeanFactory();
	    registry.destroySingleton("benzCar");
	    
	    MessageReceiver.validate();
		
	}

}
