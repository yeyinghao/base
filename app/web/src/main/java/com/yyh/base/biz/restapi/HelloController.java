package com.yyh.base.biz.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/test")
public class HelloController {

	@GetMapping("/hello")
	public void hello() {
		System.out.println(1);
	}
}
