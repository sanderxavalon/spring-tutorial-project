package com.tibame.lab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.tibame.lab.beans.*;

public class App {
    
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-lab.xml");
		
		var beanA = (BeanA) context.getBean("beanA");
		
		beanA.callFieldBean();
		
		var beanB = (BeanB) context.getBean("beanB");
		
		beanB.callFieldBean();
		
	}
}
