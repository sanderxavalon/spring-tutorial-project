package com.tibame.tutorial.bytype;

import com.tibame.tutorial.beans.BeanD;

public class BeanC {
	
	private BeanD beanD;

	public BeanD getBeanD() {
		return beanD;
	}

	// ByType，如果把Setter註解掉的話就無法注入
	public void setBeanD(BeanD beanD) {
		this.beanD = beanD;
	}
	
	

}
