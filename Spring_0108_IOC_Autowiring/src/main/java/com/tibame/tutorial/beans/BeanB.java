package com.tibame.tutorial.beans;

public class BeanB {
	
	private BeanD beanD;
	
	public BeanB() {
		System.out.println("BeanB Init!");
	}
	
	public BeanD getBeanD() {
		return beanD;
	}

	public void setBeanD(BeanD beanD) {
		this.beanD = beanD;
	}

}
