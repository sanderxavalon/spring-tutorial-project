package com.tibame.tutorial.beans.circular;

public class BeanC {
	
	private BeanB beanB;
	
	public BeanC() {
		System.out.println("BeanC Init!");
	}

	public BeanC(BeanB beanB) {
		System.out.println("BeanC Init!");
		this.beanB = beanB;
	}

}
