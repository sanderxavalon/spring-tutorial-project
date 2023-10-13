package com.tibame.lab.beans;


public class BeanB {
	
	private BeanA beanA;
	
	// 建構子會造成循環依賴...該怎麼辦呢
	public BeanB(BeanA beanA) {
		this.beanA = beanA;
	}
	
	public void callFieldBean() {
		this.beanA.called();
	}
	
	public void called() {
		System.out.println("Bean B 被呼叫！");
	}

}
