package com.sample.csrf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CSRFController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView welcomePage(){

		return new ModelAndView("welcome");
	}
	
	@RequestMapping(value="register", method=RequestMethod.POST)
	public ModelAndView register(@RequestParam("name") String name){
		
		System.out.println("Recording name : " + name);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("registerResults");
		mv.addObject("name", name);
		
		return mv;
	}
}