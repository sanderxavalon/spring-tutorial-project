package com.tibame.tutorial.beans;

public class BeanA {
	
	private BeanD beanD;
	
	private BeanD beanNameIsBlahBlah;
	
	public BeanA() {
		System.out.println("BeanA Init!");
	}

	public BeanD getBeanD() {
		return beanD;
	}

	public void setBeanD(BeanD beanD) {
		this.beanD = beanD;
	}

	public BeanD getBeanNameIsBlahBlah() {
		return beanNameIsBlahBlah;
	}

	public void setBeanNameIsBlahBlah(BeanD beanNameIsBlahBlah) {
		this.beanNameIsBlahBlah = beanNameIsBlahBlah;
	}
	
}