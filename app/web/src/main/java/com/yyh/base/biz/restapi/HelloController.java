package com.yyh.base.biz.restapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/test")
public class HelloController {
	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

	@GetMapping("/hello")
	public void hello() {
		logger.info("请求成功了");
	}
}
