package com.tibame.tutorial.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.tibame.tutorial.beans.tire.Tire;

@Component
public class Car {
	
	private Tire tireA;
	private Tire tireB;
	private Battery battery;
	private Engine engine;

	@Override
	public String toString() {
		return "Car [tireA=" + tireA + ", tireB=" + tireB + ", battery=" + battery + ", engine=" + engine + "]";
	}

	@Autowired
	public void setTireA(Tire tireA) {
		this.tireA = tireA;
	}

	@Autowired
	@Qualifier("BMWTire")
	public void setTireB(Tire tireB) {
		this.tireB = tireB;
	}

	@Autowired
	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	@Autowired
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Tire getTireA() {
		return tireA;
	}

	public Tire getTireB() {
		return tireB;
	}

	public Battery getBattery() {
		return battery;
	}

	public Engine getEngine() {
		return engine;
	}
	
}