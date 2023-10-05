package com.tibame.lab.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Tomato {
	
	// 這邊只要注入值就可以了，如果不會的話可以參照tutorial的Engine
	private Integer size;

	@Override
	public String toString() {
		return "Tomato [size=" + size + "]";
	}

	// 我是getter不要理我
	public Integer getSize() {
		return size;
	}
}
