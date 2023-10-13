package com.tibame.lab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.tibame.lab.beans.*;

public class App {
    
	public static void main(String[] args) {
		// 題目說明：	
		// 看起來建構子會造成循環依賴...那我們用Setter注入試試看吧
		// 請把BeanA BeanB刪掉建構子並且加入Setter後，再加上相對應的配置
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-lab.xml");
		
		var beanA = (BeanA) context.getBean("beanA");
		
		beanA.callFieldBean();
		
		var beanB = (BeanB) context.getBean("beanB");
		
		beanB.callFieldBean();
		
	}
}
