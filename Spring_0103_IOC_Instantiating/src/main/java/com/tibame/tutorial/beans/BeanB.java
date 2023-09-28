package com.tibame.tutorial.beans;

public class BeanB {
	
	private static BeanB beanB = new BeanB(); 
	
	public static BeanB createBeanBInstance() {
		return beanB;
	}
	
	public void callBeanb() {
		System.out.println("I'm Bean B");
	}

}
