package com.tibame.lab.beans;

public class BeanB {
	
	public BeanB() {
		Postman.sendMessage(BeanB.class.getSimpleName());
	}

}
