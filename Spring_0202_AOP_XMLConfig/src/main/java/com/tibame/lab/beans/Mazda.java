package com.tibame.lab.beans;

import com.tibame.lab.beans.car.Car;

public class Mazda implements Car {

	@Override
	public void drive() {
		System.out.println("Call drive()");
		System.out.println("I'm " + this.getClass().getSimpleName());
	}

	@Override
	public void getOutCar() {
		System.out.println("Call getOutCar()");
		System.out.println("I'm " + this.getClass().getSimpleName() + ", Thanks for calling.");
	}

	@Override
	public String showCarName() {
		System.out.println("Call showCarName()");
		return this.getClass().getSimpleName();
	}

	@Override
	public void bang() {
		System.out.println("Call bang()");
		throw new RuntimeException(this.getClass().getSimpleName());
	}
	
}
