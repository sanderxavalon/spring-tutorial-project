package com.tibame.tutorial.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tibame.tutorial.beans.Car;

@Controller
public class HelloWorld {

	public HelloWorld(Car car) {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return "HelloWorld [hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}



	@Autowired
	Car car;
	
	@RequestMapping(method = RequestMethod.GET, path = "/helloworld")
	public ModelAndView helloworld() {
		return new ModelAndView("helloworld", "Car", car);
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/session")
	public String sessionSetup(HttpSession session) {
		session.setAttribute("Car", car);
		return "setSession";
	}
	
}
