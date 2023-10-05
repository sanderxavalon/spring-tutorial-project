package com.tibame.tutorial.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.tibame.tutorial.beans.tire.Tire;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("Car")
public class Car {
	
	private Tire tireA;
	private Tire tireB;
	private Battery battery;
	private Engine engine;
	
	public Car() {
		System.out.println("This is constructor!");
		System.out.println(this.toString());
	}
	
	@PostConstruct
	public void init() {
		System.out.println("This is Post Constructor method, Init complete");
		System.out.println(this.toString());
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("This is Pre-destroy method, Ready for destroy");
		System.out.println(this.toString());
	}

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