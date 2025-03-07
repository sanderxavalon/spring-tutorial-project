package com.tibame.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.tibame.lab.beans.Benz;
import com.tibame.tutorial.beans.BeanA;


@Controller
public class SpringController {
	
	@Autowired
	BeanA beanA;
	
	@Autowired(required = false)
	Benz benz;
	
	
	@GetMapping("/tutorial/{action}")
	public ModelAndView tutorialAPI(@PathVariable("action") String action) {
		
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
	
	@GetMapping("/lab/{action}")
	public ModelAndView labAPI(@PathVariable("action") String action) {
		
		String message = "default";
		
		switch (action) {
			case "drive": {
				benz.drive();
				message = "呼叫drive，請看Console";
				break;
			}
			case "getout": {
				benz.getOutCar();
				message = "呼叫getOutCar，請看Console";
				break;
			}
			case "show": {
				benz.showCarName();
				message = "呼叫showCarName，請看Console";
				break;
			}
			case "bang": {
				benz.bang();
				message = "呼叫bang，請看Console";
				break;				
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + action);
		}
		
		return new ModelAndView("response", "message", message);
	}
}
