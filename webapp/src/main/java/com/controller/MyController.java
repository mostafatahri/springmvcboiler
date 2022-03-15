package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping(value = "/home")
	public String showhome() {
		return "index.jsp";
	}
	
	@RequestMapping(value = "/test")
	public String showtest() {
		return "test.jsp";
	}
	
}
