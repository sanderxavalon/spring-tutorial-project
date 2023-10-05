package com.tibame.tutorial.beans;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Car {

	public Car() {
		System.out.println("呼叫建構子!");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("呼叫生命週期Init！");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("呼叫生命週期destroy！");
	}
	
}