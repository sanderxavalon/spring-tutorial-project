package com.tibame.tutorial.byname;

import com.tibame.tutorial.beans.BeanD;

public class BeanA {
	
	// 這個會注入成功
	private BeanD beanD;
	
	// 這個會注入失敗
	private BeanD beanNameIsBlahBlah;
	
	public BeanD getBeanD() {
		return beanD;
	}

	public void setBeanD(BeanD beanD) {
		this.beanD = beanD;
	}

	public BeanD getBeanNameIsBlahBlah() {
		return beanNameIsBlahBlah;
	}

	public void setBeanNameIsBlahBlah(BeanD beanNameIsBlahBlah) {
		this.beanNameIsBlahBlah = beanNameIsBlahBlah;
	}
	
}