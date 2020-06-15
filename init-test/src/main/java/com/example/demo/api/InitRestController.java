package com.example.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.Hello;

/**
 * init RestConroller
 * @author mzc01-seonwoong
 * @since 20.06.11
 */

@RestController
@RequestMapping("/init")
public class InitRestController {
	@Autowired
	Hello hello;
		
	@RequestMapping("/firstCommit")
	public String firstCommit() {
		return "first commit!"+hello.hello();
	}
	
	@RequestMapping("SecondCommit")
	public String secondCommit() {
		return "second commit!";
	}
	
	@RequestMapping("ConnectTest2")
	public String connectTest() {
		return "connect test for sts, git, jenkins job!!";
	}
}
