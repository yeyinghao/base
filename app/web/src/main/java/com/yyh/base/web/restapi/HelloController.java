package com.yyh.base.web.restapi;

import com.yyh.base.dal.entity.User;
import com.yyh.base.dal.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController("/api/test")
public class HelloController {
	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

	@Autowired
	private UserMapper userMapper;
	@GetMapping("/hello")
	public void hello() {
		List<User> users = userMapper.selectByMap(new HashMap<>());
		logger.warn("请求成功了");
	}
}
