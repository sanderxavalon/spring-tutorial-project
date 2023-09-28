package com.tibame.tutorial.beans.circular;

public class BeanB {
	
	private BeanC beanC;
	
	public BeanB() {
		System.out.println("BeanB Init!");
	}

	public BeanB(BeanC beanC) {
		System.out.println("BeanB Init!");
		this.beanC = beanC;
	}

}
