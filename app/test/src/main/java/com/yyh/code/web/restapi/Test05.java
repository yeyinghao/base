package com.yyh.code.web.restapi;

import com.yyh.code.BaseTest;
import com.yyh.code.dal.mapper.UserMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;


public class Test05 extends BaseTest {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void test2() {
		System.out.println(userMapper.selectByMap(new HashMap<>()));
	}
}
