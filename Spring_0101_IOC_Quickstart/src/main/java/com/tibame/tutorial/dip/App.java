package com.tibame.tutorial.dip;

import com.tibame.tutorial.dip.benzImpl.BenzCar;
import com.tibame.tutorial.dip.benzImpl.BenzChasis;
import com.tibame.tutorial.dip.benzImpl.BenzFrame;
import com.tibame.tutorial.dip.benzImpl.BenzTire;
import com.tibame.tutorial.dip.mazdaImpl.MazdaTire;
import com.tibame.tutorial.dip.theinterface.IChasis;
import com.tibame.tutorial.dip.theinterface.IFrame;
import com.tibame.tutorial.dip.theinterface.ITire;

public class App {
	
	public static void main(String[] args) {
		
		ITire tire = new MazdaTire(15.00);
		
//		ITire tire = new BenzTire(10);
		IChasis chasis = new BenzChasis(tire);
		IFrame frame = new BenzFrame(chasis);
		BenzCar car = new BenzCar(frame);
		car.drive();
	}
}
