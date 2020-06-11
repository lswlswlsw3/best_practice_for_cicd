package com.example.demo.apj;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * init RestConroller
 * @author mzc01-seonwoong
 * @since 20.06.11
 */

@RestController
@RequestMapping("/init")
public class InitRestController {
	@RequestMapping("/hello")
	public String hello() {
		return "hello to spring boot!";
	}
	
	@RequestMapping("/firstCommit")
	public String firstCommit() {
		return "first commit!";
	}
	
	@RequestMapping("SecondCommit")
	public String secondCommit() {
		return "second commit!";
	}
}
