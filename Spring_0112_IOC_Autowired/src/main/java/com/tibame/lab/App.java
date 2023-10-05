package com.tibame.lab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tibame.lab.beans.Burger;

public class App {
	
	public static void main(String[] args) {
		// 題目說明：
		// 歡迎再度回來autowire QQ，XML我已經幫各位配置好了
		// 需要做的幾件事情：
		// 你可以選擇建構子或是Field自動注入，隨喜，但是要記得加上建構子或是@Autowired喔
		// 然後各個@Component也要記得加,要不然Spring看不到
		// 蕃茄的是需要塞入值，想不起來的話參考Tutorial Engine
		// 起司可以用全用@Qualifier或是你想搭配一個@Primary也可以，隨喜
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-lab.xml");
		
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
