package com.test.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String test() {
		return "service2 is up and running: " + new Date();
	}

}
