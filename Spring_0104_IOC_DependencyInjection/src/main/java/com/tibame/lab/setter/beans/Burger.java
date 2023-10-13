package com.tibame.lab.setter.beans;

import com.tibame.lab.setter.beans.cheese.CheddarCheese;
import com.tibame.lab.setter.beans.cheese.Cheese;

public class Burger {
	
	private CheddarCheese cheeseOnTop;
	private Cheese cheeseOnBottom;
	private Lettuce lettuce;
	private Tomato tomato;
	
	@Override
	public String toString() {
		return "Burger [cheeseOnTop=" + cheeseOnTop + ", cheeseOnBottom=" + cheeseOnBottom + ", lettuce=" + lettuce
				+ ", tomato=" + tomato + "]";
	}
	
	public CheddarCheese getCheeseOnTop() {
		return cheeseOnTop;
	}
	public void setCheeseOnTop(CheddarCheese cheeseOnTop) {
		this.cheeseOnTop = cheeseOnTop;
	}
	public Cheese getCheeseOnBottom() {
		return cheeseOnBottom;
	}
	public void setCheeseOnBottom(Cheese cheeseOnBottom) {
		this.cheeseOnBottom = cheeseOnBottom;
	}
	public Lettuce getLettuce() {
		return lettuce;
	}
	public void setLettuce(Lettuce lettuce) {
		this.lettuce = lettuce;
	}
	public Tomato getTomato() {
		return tomato;
	}
	public void setTomato(Tomato tomato) {
		this.tomato = tomato;
	}

}
