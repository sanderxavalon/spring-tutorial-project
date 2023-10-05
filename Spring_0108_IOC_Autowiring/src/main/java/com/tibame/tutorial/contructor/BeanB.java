package com.tibame.tutorial.contructor;

import com.tibame.tutorial.beans.BeanD;

public class BeanB {
	
	private BeanD beanD;

	// 使用建構子注入，就不需要額外指定空建構子
	public BeanB(BeanD beanD) {
		this.beanD = beanD;
	}

	// 我是getter，不用理我
	public BeanD getBeanD() {
		return beanD;
	}
	
}
