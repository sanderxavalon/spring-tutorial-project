package com.tibame.lab.beans.cheese;

public abstract class Cheese {
	
	protected String type;

	public Cheese(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
