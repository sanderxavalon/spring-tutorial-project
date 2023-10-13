package com.tibame.lab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tibame.lab.beans.Postman;

public class App {

	public static void main(String[] args) {
		
		// 題目說明：	
		// Postman是我的小間諜,他會監測BeanA是不是第一個在SpringIOC裡面被實例化的
		// 請讓BeanA比BeanB跟BeanC晚被實例化
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-lab.xml");
		
		Postman.validate();
		
	}
}
