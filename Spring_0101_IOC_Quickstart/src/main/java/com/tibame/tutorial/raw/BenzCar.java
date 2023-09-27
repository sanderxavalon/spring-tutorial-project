package com.tibame.tutorial.raw;

public class BenzCar {
	
	private BenzFrame frame;
	
	public BenzCar() {
		this.frame = new BenzFrame();
	}
	
	public void drive() {
		frame.drive();
		System.out.println("I'm Benz Car");
	}

}
