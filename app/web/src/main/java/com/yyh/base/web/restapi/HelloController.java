package com.yyh.base.web.restapi;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yyh.base.dal.entity.User;
import com.yyh.base.dal.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@RestController("/api/test")
public class HelloController {
	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

	@Resource
	private UserMapper userMapper;

	@GetMapping("/hello")
	public void hello() {
		Page<List<User>> objects = PageHelper.startPage(1, 1);

		 userMapper.selectByMap(new HashMap<>());
		objects.getTotal();
		logger.warn("请求成功了");
	}
}
