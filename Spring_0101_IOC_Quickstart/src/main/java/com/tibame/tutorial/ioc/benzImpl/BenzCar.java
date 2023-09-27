package com.tibame.tutorial.ioc.benzImpl;

import com.tibame.tutorial.ioc.theinterface.IFrame;

public class BenzCar {
	
	private IFrame frame;
	
	public BenzCar(IFrame frame) {
		this.frame = frame;
	}
	
	public void drive() {
		frame.drive();
		System.out.println("I'm Benz Car");
	}

}
