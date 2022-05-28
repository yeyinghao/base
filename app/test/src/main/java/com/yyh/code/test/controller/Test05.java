package com.yyh.code.test.controller;

import com.yyh.code.dal.mapper.UserMapper;
import com.yyh.code.test.BaseTest;
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
