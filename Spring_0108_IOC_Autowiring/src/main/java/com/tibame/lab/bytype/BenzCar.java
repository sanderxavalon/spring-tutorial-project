package com.tibame.lab.bytype;

import com.tibame.lab.beans.NormalTire;

public class BenzCar {
	
	private NormalTire tire;

	public NormalTire getTire() {
		return tire;
	}
	// Setter的變數名稱不一樣，所以應該要用ByType不是ByName
	public void setTire(NormalTire tire) {
		this.tire = tire;
	}

}
