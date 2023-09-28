package com.tibame.lab.beans;

public class BeanA {
	
	public BeanA() {
		Postman.sendMessage(BeanA.class.getSimpleName());
	}
	
}
