package com.tibame.lab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tibame.lab.beans.BMWCar;
import com.tibame.lab.beans.BenzCar;
import com.tibame.tutorial.beans.BeanA;

public class App {
	
	public static void main(String[] args) {
		
		// 題目說明：
		// BenzCar在容器中只需要一個實體
		// BMWCar在容器中只需要多個實體
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-lab.xml");
		
		// 這邊用類型抓Bean，不用在意Id沒關係
		var benzCar1 =  context.getBean(BenzCar.class);
		var benzCar2 =  context.getBean(BenzCar.class);
		
		System.out.println("Benz1:" + benzCar1.toString());
		System.out.println("Benz2:" + benzCar2.toString());
		
		if (benzCar1 != benzCar2) {
			System.out.println("咦，這兩台車應該是不一樣的實體喔，在檢查一下吧!");
			return;
		}
		
		// 這邊用類型抓Bean，不用在意Id沒關係
		var bmwCar1 =  context.getBean(BMWCar.class);
		var bmwCar2 =  context.getBean(BMWCar.class);
		
		System.out.println("BMW1:" + bmwCar1.toString());
		System.out.println("BMW2:" + bmwCar2.toString());

		if (bmwCar1 == bmwCar2) {
			System.out.println("咦，這兩台車應該是一樣的實體喔，在檢查一下吧!");
			return;
		}
		
		System.out.println("配置成功！");

	}

}
