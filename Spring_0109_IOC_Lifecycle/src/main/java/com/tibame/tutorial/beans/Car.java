package com.tibame.tutorial.beans;

import com.tibame.tutorial.beans.tire.Tire;

public class Car {
	
	private Tire tireA;
	private Tire tireB;
	private Battery battery;
	private Engine engine;

	public Car() {
		System.out.println("This is constructor!");
		System.out.println(this.toString());
	}
	
	public void init() {
		System.out.println("This is Post Constructor method, Init complete");
		System.out.println(this.toString());
	}
	
	public void destroy() {
		System.out.println("This is Pre-destroy method, Ready for destroy");
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Car [tireA=" + tireA + ", tireB=" + tireB + ", battery=" + battery + ", engine=" + engine + "]";
	}

	public Tire getTireA() {
		return tireA;
	}

	public void setTireA(Tire tireA) {
		this.tireA = tireA;
	}

	public Tire getTireB() {
		return tireB;
	}

	public void setTireB(Tire tireB) {
		this.tireB = tireB;
	}

	public Battery getBattery() {
		return battery;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
}