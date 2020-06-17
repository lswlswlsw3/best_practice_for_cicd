package com.example.demo.api;

import java.text.SimpleDateFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * init RestConroller
 * @author sunwoong@mz.co.kr
 * @since 20.06.11
 */

@RestController
@RequestMapping("/cicd")
public class InitRestController {
	
	@RequestMapping("")
	public String firstCommit() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return "best practice cicd works!! : "+format.format(System.currentTimeMillis());
	}
}
