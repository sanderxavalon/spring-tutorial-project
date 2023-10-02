package com.tibame.lab.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

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
