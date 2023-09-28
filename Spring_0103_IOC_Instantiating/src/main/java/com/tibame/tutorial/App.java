package com.tibame.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tibame.tutorial.beans.BeanA;
import com.tibame.tutorial.beans.BeanB;

public class App {
    
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-tutorial.xml");
		
		BeanA beanA = context.getBean(BeanA.class);
		
		beanA.callBeanA();
		
		BeanB beanB = context.getBean(BeanB.class);
		
		beanB.callBeanb();
	
	}
}
