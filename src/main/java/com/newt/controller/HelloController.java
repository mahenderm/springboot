package com.newt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("demo")
public class HelloController {
	@RequestMapping(method=RequestMethod.GET)
	public String home(){
		return "demo/home";
		
	}

}
