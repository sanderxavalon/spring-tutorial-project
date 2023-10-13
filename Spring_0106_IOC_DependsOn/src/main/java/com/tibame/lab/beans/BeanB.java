package com.tibame.lab.beans;

public class BeanB {
	
	// 我是普通建構子，不用理我
	public BeanB() {
		Postman.sendMessage(BeanB.class.getSimpleName());
	}

}
