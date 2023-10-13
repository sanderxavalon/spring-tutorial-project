package com.tibame.lab.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tibame.lab.setter.beans.Burger;

public class App {
    
	public static void main(String[] args) {
		// 題目說明：
		// 請依照Setter注入進行SpringIOC配置
		// 要注意生菜的建構子是不是正確
		// 漢堡中的第二個起司有多個實現，Setter應該怎麼做呢
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-lab-setter.xml");
		
		Burger burger = (Burger) context.getBean("burger");
		
		if(burger.getLettuce() == null) {
			System.out.println("漢堡裡面沒有生菜QQ");
			return;
		}
		
		if(!burger.getCheeseOnTop().toString().equals("Cheddar")) {
			System.out.println("漢堡上層的起司不對啦QQ");
			return;
		}
		
		if(!burger.getCheeseOnBottom().toString().equals("Cottage")) {
			System.out.println("漢堡下層的起司不對啦QQ");
			return;
		}
		
		if(burger.getTomato().getSize() != 10) {
			System.out.println("漢堡的大小不對啦QQ");
			return;
		}
		
		System.out.println("哇這個漢堡太爽ㄌㄅ");
		
	}
}
