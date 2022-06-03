package com.springdemo.minimaximarket;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class TestController {
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public @ResponseBody String postLogin(String user) {
		String userName = user.trim();
		return userName;
	}
}
