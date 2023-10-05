package com.tibame.lab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tibame.lab.beans.Burger;

public class App {
    
	public static void main(String[] args) {
		
		// 題目說明：
		// 現在我們要完全擺脫XML,改用AnnotationConfigApplicationContext之後
		// 剛剛的	<context:component-scan base-package="com.tibame.lab"/>
		// 就可以改用@ComponentScan啦，不過記得要加上@Configuration喔
		// 然後在BurgerConfiguration裡面用@Bean去註冊一個漢堡
		// 用法有問題可以再回去參照Tutorial
	    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
	    
	    var burger = context.getBean(Burger.class);
	    
	    if (!"Cheddar".equals(burger.getCheeseType())) {
			System.out.println("漢堡的起司不是Cheddar，嗚嗚");
			return;
		}
	    
	    if (burger.getSize() !=  10) {
	    	System.out.println("漢堡size不是10，嗚嗚");
			return;
		}
	    
	    if (burger.getPrice() !=  19.99) {
	    	System.out.println("漢堡價格不是19.99，嗚嗚");
			return;
		}
	    
	    System.out.println("配置成功");
		
	}
}
