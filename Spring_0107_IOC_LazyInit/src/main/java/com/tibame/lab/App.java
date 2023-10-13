package com.tibame.lab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tibame.lab.beans.BeanA;
import com.tibame.lab.beans.MessageReceiver;

public class App {
    
	// 題目說明：	
	// 這個要測試你對Lazy-Init熟不熟，請讓BeanA變成Lazy-Init
	// 我會讓執行序睡三秒，小間諜如果偵測到BeanA馬上被Init，那你就要重配置囉！
	public static void main(String[] args) throws InterruptedException {
		
		var thread = new Thread(new MessageReceiver());
		
		thread.run();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-lab.xml");
		
		Thread.sleep(3000);
		
		var beanA = context.getBean(BeanA.class);
		
		System.out.println("結束！");
		
	}
}
