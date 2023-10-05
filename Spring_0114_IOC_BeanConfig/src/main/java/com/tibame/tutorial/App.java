package com.tibame.tutorial;

import com.google.gson.Gson;
import com.tibame.tutorial.beans.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.weaving.DefaultContextLoadTimeWeaver;
import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@Configuration 是告訴Spring這是類似xml的設定檔
@Configuration
// 因為沒有xml, 改用@ComponentScan
// 其實跟<context:component-scan base-package="com.tibame.tutorial"/>是一樣的東西
@ComponentScan(basePackages = "com.tibame.tutorial")
public class App {
	
	public static void main(String[] args) {
		
		// 要注意這裡是使用AnnotationConfigApplicationContext 加上指定讀取的類別
		// 不再是讀取XML的ClassPathXmlApplicationContext喔
	    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
	    
	    System.out.println(new Gson().toJson(context.getBean("datasource")));
	    
	}
}