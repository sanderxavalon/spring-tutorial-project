package com.tibame.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tibame.tutorial.beans.*;

public class App {
    
	public static void main(String[] args) throws InterruptedException {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-tutorial.xml");
		
		var beanA = context.getBean(BeanA.class);
		
		beanA.getBeanD().callBeanD();
		
		var beanB = context.getBean(BeanB.class);
		
		beanB.getBeanD().callBeanD();
		
		var beanC = context.getBean(BeanC.class);
		
		beanC.getBeanD().callBeanD();
		
		// This throw exception
		// beanA.getBeanNameIsBlahBlah();
	
	}
}
