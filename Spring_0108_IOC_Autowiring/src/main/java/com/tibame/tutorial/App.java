package com.tibame.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tibame.tutorial.beans.*;
import com.tibame.tutorial.byname.*;
import com.tibame.tutorial.bytype.*;
import com.tibame.tutorial.contructor.*;

public class App {
    
	public static void main(String[] args) throws InterruptedException {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-tutorial.xml");
		
		var beanA = context.getBean(BeanA.class);
		System.out.println("BeanA ByName變數名稱判斷注入測試：");
		beanA.getBeanD().callBeanD();
		// 這個會失敗，因為Setter名字對不上
		beanA.getBeanNameIsBlahBlah().callBeanD();
		
		var beanB = context.getBean(BeanB.class);
		System.out.println("BeanB Constructor建構子注入測試：");
		beanB.getBeanD().callBeanD();
		
		var beanC = context.getBean(BeanC.class);
		System.out.println("BeanC ByType類別判斷注入測試：");
		beanC.getBeanD().callBeanD();
		
	}
}
