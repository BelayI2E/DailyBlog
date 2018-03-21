package com.daily.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/member")
public class LoginController {
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String register(){
		return "login";
	}
	@RequestMapping(value="/home/{id}/{name}",method=RequestMethod.GET)
	public ModelAndView home(@PathVariable("id")int id,@PathVariable("name")String name){
		System.out.println(id+ " " + name);
		return new ModelAndView("index");
		
	}

}
