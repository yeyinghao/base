package com.yyh.base.biz;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 程序入口-启动类
 *
 * @author yeyinghao
 * @version 1.0.0
 * @date: 2022/5/24 21:54
 * @description: BootstrapApplication.java
 */
@SpringBootApplication(scanBasePackages = "com.yyh.base")
@NacosPropertySource(dataId = "base-application.yml", autoRefreshed = true)
public class BootstrapApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(BootstrapApplication.class, args);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
