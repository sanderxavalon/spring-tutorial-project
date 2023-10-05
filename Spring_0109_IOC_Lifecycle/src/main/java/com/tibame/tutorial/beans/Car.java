package com.tibame.tutorial.beans;

public class Car {

	public Car() {
		System.out.println("呼叫建構子!");
	}
	
	public void init() {
		System.out.println("呼叫生命週期Init！");
	}
	
	public void destroy() {
		System.out.println("呼叫生命週期destroy！");
	}

}