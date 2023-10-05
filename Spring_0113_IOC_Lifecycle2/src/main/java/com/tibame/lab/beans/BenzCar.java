package com.tibame.lab.beans;

public class BenzCar {
	
	private NormalTire tireA;
	private NormalTire tireB;

	// 這裡有建構子，所以接管之後不一定要@Autowired
	// 不過下面Setter已經寫好，你可以把建構子刪掉然後貼上@Autowired試試看，會達成一樣的效果喔
	public BenzCar(NormalTire tireA, NormalTire tireB) {
		System.out.println("呼叫建構子!");
		this.tireA = tireA;
		this.tireB = tireB;
	}

	// 這個是init方法
	public void lalalaThisIsInit() {
		System.out.println("呼叫生命週期Init！");
		MessageReceiver.sendMessage("Init!");
	}
	
	// 這個是destroy方法
	public void lalalaThisIsDestroy() {
		System.out.println("呼叫生命週期destroy！");
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