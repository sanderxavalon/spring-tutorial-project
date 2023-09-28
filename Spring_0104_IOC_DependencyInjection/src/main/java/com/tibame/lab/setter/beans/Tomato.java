package com.tibame.lab.setter.beans;

public class Tomato {
	
	private Integer size;

	@Override
	public String toString() {
		return "Tomato [size=" + size + "]";
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}
	
}
