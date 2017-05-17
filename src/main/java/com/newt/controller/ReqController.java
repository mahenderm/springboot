package com.newt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/greet")
public class ReqController {
	 // @RequestMapping("/greet")
	    String sayHello(@RequestParam("name") String name) {
	        if (name == null || name.isEmpty()) {
	            throw new IllegalArgumentException("The 'name' parameter must not be null or empty");
	        }
	        return String.format("Hello %s!", name);
	    }

}
