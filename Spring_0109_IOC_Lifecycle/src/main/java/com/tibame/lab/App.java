package com.tibame.lab;

import org.springframework.beans.factory.support.DefaultSingletonBeanRegistry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tibame.lab.beans.BenzCar;
import com.tibame.lab.beans.MessageReceiver;

public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-lab.xml");
		
		var benzcar = context.getBean(BenzCar.class);
		
		benzcar.getTireA().run();
		benzcar.getTireB().run();
		
	    DefaultSingletonBeanRegistry registry = (DefaultSingletonBeanRegistry) context.getAutowireCapableBeanFactory();
	    
	    // 這裡用的是Bean的Id來把Bean銷毀，要注意id有沒有一致喔
	    registry.destroySingleton("benzCar");
	    
	    MessageReceiver.validate();
		
	}

}
