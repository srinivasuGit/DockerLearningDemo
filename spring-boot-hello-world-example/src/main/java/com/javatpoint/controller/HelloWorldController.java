package com.javatpoint.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	public HelloWorldController() {

	}

	@GetMapping(value = "/welcome/{name}")
	public String hello(@PathVariable("name") String name) {
		String msg = name + " Welcome to Demo Project";
		return msg;
	}
}
