package com.yyh.code.test;

import com.yyh.code.bootstrap.BootstrapApplication;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootstrapApplication.class)
@WebAppConfiguration
public class BaseTest {
	@Before
	public void init() {
		System.out.println("------开始测试------");
	}

	@After
	public void after() {
		System.out.println("------测试结束------");
	}
}
