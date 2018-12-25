package com.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogHelloWorld {

	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public String helloWorld() {
		
		return "hello";
		 
	}
}
