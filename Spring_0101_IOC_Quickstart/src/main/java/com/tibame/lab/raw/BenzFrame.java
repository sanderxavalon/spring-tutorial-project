package com.tibame.lab.raw;

public class BenzFrame {
	
	private BenzChasis chasis;
	
	public BenzFrame() {
		this.chasis = new BenzChasis();
	}

	public void drive() {
		chasis.drive();
		System.out.println("I'm Benz Frame");
	}
	
}
