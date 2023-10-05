package com.tibame.tutorial.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.tibame.tutorial.beans.tire.Tire;

@Component
public class Car {

	// 雖然Tire有兩個類別，但別擔心，我們在BenzTire貼上了@Primary
	// 所以Spring會自動幫我們優先注入BenzTire
	private Tire tireA;
	private Tire tireB;
	private Battery battery;
	private Engine engine;
	
//	@Autowired
//	private Tire tireA;
//	@Autowired
//	@Qualifier("mazdaTire")
//	private Tire tireB;
//	@Autowired
//	private Battery battery;
//	@Autowired
//	private Engine engine;
	
	// 但是我如果TireB想要Mazda，但是@Primary都是Benz的情況下
	// 可以在建構子裡面使用 @Qualifier("mazdaTire") 
	// 那注入進去的就會是mazda囉
	public Car(Tire tireA, Tire tireB, Battery battery, Engine engine) {
		this.tireA = tireA;
		this.tireB = tireB;
		this.battery = battery;
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
	
	@Override
	public String toString() {
		return "Car [tireA=" + tireA + ", tireB=" + tireB + ", battery=" + battery + ", engine=" + engine + "]";
	}
	
}