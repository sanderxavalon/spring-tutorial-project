package com.tibame.lab.beans;

public class BeanA {
	
	// 我是普通建構子，不用理我
	public BeanA() {
		Postman.sendMessage(BeanA.class.getSimpleName());
	}
	
}
