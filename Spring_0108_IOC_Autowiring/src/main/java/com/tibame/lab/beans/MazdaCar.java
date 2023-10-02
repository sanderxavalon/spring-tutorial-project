package com.tibame.lab.beans;

import com.tibame.lab.beans.tire.MazdaTire;

public class MazdaCar {
	
	private MazdaTire mazdaTire;

	public MazdaCar(MazdaTire mazdaTire) {
		this.mazdaTire = mazdaTire;
	}

	public MazdaTire getMazdaTire() {
		return mazdaTire;
	}

	public void setMazdaTire(MazdaTire mazdaTire) {
		this.mazdaTire = mazdaTire;
	}

}
