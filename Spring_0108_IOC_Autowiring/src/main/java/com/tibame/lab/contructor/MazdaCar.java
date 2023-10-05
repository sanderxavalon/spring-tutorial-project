package com.tibame.lab.contructor;

import com.tibame.lab.beans.NormalTire;

public class MazdaCar {
	
	private NormalTire tire;

	// 有建構子，那就用Constructor
	public MazdaCar(NormalTire tire) {
		this.tire = tire;
	}

	// 只有Getter
	public NormalTire getTire() {
		return tire;
	}
	
	// 沒有Setter，不能使用ByType或是ByName

}
