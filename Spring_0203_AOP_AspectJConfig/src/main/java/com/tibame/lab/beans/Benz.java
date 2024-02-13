package com.tibame.lab.beans;


public class Benz {

	public void drive() {
		System.out.println("Call drive()");
		System.out.println("I'm " + this.getClass().getSimpleName());
	}

	public void getOutCar() {
		System.out.println("Call getOutCar()");
		System.out.println("I'm " + this.getClass().getSimpleName() + ", Thanks for calling.");
	}

	public String showCarName() {
		System.out.println("Call showCarName()");
		return this.getClass().getSimpleName();
	}

	public void bang() {
		System.out.println("Call bang()");
		throw new RuntimeException(this.getClass().getSimpleName());
	}

}
