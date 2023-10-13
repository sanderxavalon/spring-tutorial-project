package com.tibame.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tibame.tutorial.beans.BeanA;
import com.tibame.tutorial.beans.BeanB;

public class App {
    
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-tutorial.xml");
		
		Object a = context.getBean("beanA");
		
		if (a instanceof BeanA) {
			((BeanA) a).callBeanA();
		}
		
//		BeanB b = (BeanB) context.getBean("ThisBeanB");
		BeanB b = (BeanB) context.getBean("beanB");
			
		if (b instanceof BeanB) {
			((BeanB) b).callBeanb();
		}
		
	}
}
