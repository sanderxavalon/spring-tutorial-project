package com.tibame.tutorial.constructor.beans;

import com.tibame.tutorial.constructor.beans.tire.Tire;

public class Car {
	
	private Tire tireA;
	private Tire tireB;
	private Battery battery;
	private Engine engine;
	

	public Car(Tire tireA, Tire tireB, Battery battery, Engine engine) {
		this.tireA = tireA;
		this.tireB = tireB;
		this.battery = battery;
		this.engine = engine;
	}


	@Override
	public String toString() {
		return "Car [tireA=" + tireA + ", tireB=" + tireB + ", battery=" + battery + ", engine=" + engine + "]";
	}

}
