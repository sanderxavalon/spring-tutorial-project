package com.tibame.lab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tibame.lab.beans.BoringBean;
import com.tibame.lab.beans.NotBoringBean;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-lab.xml");
		
		BoringBean boringBean = context.getBean(BoringBean.class);
		
		boringBean.callBoringBean();
		
		NotBoringBean notBoringBean = context.getBean(NotBoringBean.class);
		
		notBoringBean.checkerSpeak();
	
	}

}
