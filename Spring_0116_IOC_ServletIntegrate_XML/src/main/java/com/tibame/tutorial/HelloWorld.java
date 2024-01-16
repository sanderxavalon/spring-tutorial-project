package com.tibame.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tibame.tutorial.beans.Car;

@Controller
public class HelloWorld {

	@Autowired
	Car car;
	
	@RequestMapping(method = RequestMethod.GET, path = "/helloworld")
	public ModelAndView helloworld() {
		return new ModelAndView("model", "Car", car);
	}
	
}
