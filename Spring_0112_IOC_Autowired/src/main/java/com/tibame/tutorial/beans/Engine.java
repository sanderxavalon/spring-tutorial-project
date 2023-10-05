package com.tibame.tutorial.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	
	// 在XML中，要注入原始型別是需要
	// <bean id="xxx">
	//   <property name="brand" value="Mazda" />
	// </bean>
	// 現在只需要@Value("Mazda")就會自動幫你寫進去囉
	@Value("Mazda")
	private String brand;
	// 然後跟之前一樣，雖然是字串，但是宣告是Integer，Spring會自動幫你轉
	@Value("10")
	private Integer lifeYear;
	
	@Override
	public String toString() {
		return "Engine [brand=" + brand + ", lifeYear=" + lifeYear + "]";
	}
	
}

