package com.tibame.lab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.tibame.lab.beans.*;

public class App {
    
	public static void main(String[] args) {
		// 題目說明：	
		// 請依照建構子注入進行SpringIOC配置
		// 要注意生菜的建構子是不是正確
		// 漢堡中的第二個起司有多個實現，在建構子應該怎麼做呢
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-lab.xml");
		
		var beanA = (BeanA) context.getBean("beanA");
		
		beanA.callFieldBean();
		
		var beanB = (BeanB) context.getBean("beanB");
		
		beanB.callFieldBean();
		
	}
}
