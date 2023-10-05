package com.tibame.lab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tibame.lab.beans.MessageReceiver;

public class App {
	
	public static void main(String[] args) {
		
		// 題目說明：
		// 之前我們都是用XML設置Bean標籤進行配置，現在我們用@Component在需要的類別貼上就可以囉
		// 但是記得要在XML裡面告訴Spring要去哪些包找有貼@Component的類別喔
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-lab.xml");
		
		MessageReceiver.validate();
		
	}

}
