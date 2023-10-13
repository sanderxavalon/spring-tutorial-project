package com.tibame.lab.beans;

public class BeanC {
	
	// 我是普通建構子，不用理我
	public BeanC() {
		Postman.sendMessage(BeanC.class.getSimpleName());
	}
	
}
