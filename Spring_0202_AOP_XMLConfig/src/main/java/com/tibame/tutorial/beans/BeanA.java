package com.tibame.tutorial.beans;

import org.springframework.stereotype.Component;

@Component
public class BeanA {

	public void speakBeanName() {
		System.out.println("call speakBeanName()");
		System.out.println("I'm " + this.getClass().getSimpleName());
	}
	
	public void byebye() {
		System.out.println("Call byebye()");
		System.out.println("I'm " + this.getClass().getSimpleName() + ", Thanks for calling.");
	}
	
	public String returnBeanName() {
		System.out.println("Call returnBeanName()");
		return this.getClass().getSimpleName();
	}
	
	public void throwError() {
		System.out.println("Call throwError()");
		throw new RuntimeException(this.getClass().getSimpleName());
	}

}
