package com.yyh.base.bootstrap;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 程序入口-启动类
 *
 * @author yeyinghao
 * @version 1.0.0
 * @date: 2022/5/24 21:54
 * @description: BootstrapApplication.java
 */
@ComponentScan(basePackages = "com.yyh.base")
@MapperScan("com.yyh.base.dal.mapper")
@NacosPropertySource(dataId = "base.yml", autoRefreshed = true)
@SpringBootApplication
public class BootstrapApplication {

	private static final Logger logger = LoggerFactory.getLogger("TARCERMONITOR");

	public static void main(String[] args) {
		try {
			SpringApplication.run(BootstrapApplication.class, args);
			logger.info("启动成功");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
