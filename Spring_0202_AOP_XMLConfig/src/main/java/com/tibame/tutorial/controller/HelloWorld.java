package com.tibame.tutorial.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.tibame.tutorial.beans.NormalBean;

@Controller
public class HelloWorld {
	
	@Autowired
	@Qualifier("beanA")
	NormalBean beanA;
	
	@Autowired
	@Qualifier("beanB")
	NormalBean beanB;
	
	@Autowired
	@Qualifier("beanC")
	NormalBean beanC;
	
	
	@GetMapping("/helloworld/{action}")
	public ModelAndView helloworld(@PathVariable String action) {
		
		String message = "default";
		
		switch (action) {
			case "speak": {
				beanA.speakBeanName();
				message = "呼叫Speak，請看Console";
				break;
			}
			case "bye": {
				beanA.byebye();
				message = "呼叫bye，請看Console";
				break;
			}
			case "returnname": {
				beanA.returnBeanName();
				message = "呼叫returnname，請看Console";
				break;
			}
			case "throwerror": {
				beanA.throwError();
				message = "呼叫throwerror，請看Console";
				break;				
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + action);
		}
		
		return new ModelAndView("response", "message", message);
	}
}
