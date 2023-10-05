package com.tibame.lab.byname;

import com.tibame.lab.beans.NormalTire;

public class BMWCar {

	private NormalTire normalTire;

	public NormalTire getNormalTire() {
		return normalTire;
	}

	// Setter名字與ID一致，可以用ByName，當然ByType也是可以的
	public void setNormalTire(NormalTire normalTire) {
		this.normalTire = normalTire;
	}
	
}
