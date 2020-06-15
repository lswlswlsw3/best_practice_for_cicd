package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloImpl implements Hello {

	@Override
	public String hello() {
		return "good job";
	}


}
