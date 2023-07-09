package com.jwt2.jwt2.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {
	
	@RequestMapping({ "/hello" })
	public String hello() {
		return "Hello World";
	}

}
