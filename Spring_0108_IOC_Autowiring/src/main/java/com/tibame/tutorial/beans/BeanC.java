package com.tibame.tutorial.beans;

public class BeanC {
	
	private BeanD beanD;
	
	public BeanC(BeanD beanD) {
		System.out.println("BeanC Init!");
		this.beanD = beanD;
	}
	
	public BeanD getBeanD() {
		return beanD;
	}

	public void setBeanD(BeanD beanD) {
		this.beanD = beanD;
	}

}
