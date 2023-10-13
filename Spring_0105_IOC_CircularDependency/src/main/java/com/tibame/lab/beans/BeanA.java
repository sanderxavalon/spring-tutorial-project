package com.tibame.lab.beans;

public class BeanA {
	
	private BeanB beanB;

	// 建構子會造成循環依賴...該怎麼辦呢
	public BeanA(BeanB beanB) {
		this.beanB = beanB;
	}
	
	public void callFieldBean() {
		this.beanB.called();
	}
	
	public void called() {
		System.out.println("Bean A 被呼叫！");
	}
	
}
