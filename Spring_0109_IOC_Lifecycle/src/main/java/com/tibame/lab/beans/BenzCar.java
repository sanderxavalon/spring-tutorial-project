package com.tibame.lab.beans;


public class BenzCar {
	
	private NormalTire tireA;
	private NormalTire tireB;

	// 這裡有建構子，所以優先用autowire="constructor"
	// 不過下面Setter已經寫好，所以我們只要補上空的建構子就可以使用ByType/ByName囉
	public BenzCar(NormalTire tireA, NormalTire tireB) {
		System.out.println("呼叫建構子!");
		this.tireA = tireA;
		this.tireB = tireB;
	}

	// 這個是init方法
	public void lalalaThisIsInit() {
		System.out.println("呼叫生命週期Init！");
		// 不用管我
		MessageReceiver.sendMessage("Init!");
	}
	// 這個是destroy方法
	public void lalalaThisIsDestroy() {
		System.out.println("呼叫生命週期destroy！");
		// 不用管我
		MessageReceiver.sendMessage("Destroy!");
	}

	public NormalTire getTireA() {
		return tireA;
	}

	public void setTireA(NormalTire tireA) {
		this.tireA = tireA;
	}

	public NormalTire getTireB() {
		return tireB;
	}

	public void setTireB(NormalTire tireB) {
		this.tireB = tireB;
	}

}