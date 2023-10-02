package com.tibame.lab.beans;

import com.tibame.lab.beans.tire.BMWTire;
import com.tibame.lab.beans.tire.BenzTire;

public class BenzCar {
	
	private BenzTire tireA;
	private BMWTire tireB;

	public BenzCar(BenzTire tireA, BMWTire tireB) {
		System.out.println("This is constructor!");
		this.tireA = tireA;
		this.tireB = tireB;
	}

	public void lalalaThisIsInit() {
		System.out.println("This is Post Constructor method, Init complete");
		MessageReceiver.sendMessage("Init!");
	}
	
	public void lalalaThisIsDestroy() {
		System.out.println("This is Pre-destroy method, Ready for destroy");
		MessageReceiver.sendMessage("Destroy!");
	}

	public BenzTire getTireA() {
		return tireA;
	}

	public void setTireA(BenzTire tireA) {
		this.tireA = tireA;
	}

	public BMWTire getTireB() {
		return tireB;
	}

	public void setTireB(BMWTire tireB) {
		this.tireB = tireB;
	}

}