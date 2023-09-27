package com.tibame.tutorial.beans;

public class BeanC {
	private BeanB beanB;
	
	public BeanC(BeanB b) {
		this.beanB = b;
	}
	
	public void callBeanC() {
		System.out.println("This is Bean C!");
		beanB.callBeanb();
	}

}
