package com.tibame.tutorial.setter.beans;

import com.tibame.tutorial.setter.beans.tire.Tire;

public class Car {
	
	private Tire tireA;
	private Tire tireB;
	private Battery battery;
	private Engine engine;

	@Override
	public String toString() {
		return "Car [tireA=" + tireA + ", tireB=" + tireB + ", battery=" + battery + ", engine=" + engine + "]";
	}

	public void setTireA(Tire tireA) {
		this.tireA = tireA;
	}

	public void setTireB(Tire tireB) {
		this.tireB = tireB;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
}