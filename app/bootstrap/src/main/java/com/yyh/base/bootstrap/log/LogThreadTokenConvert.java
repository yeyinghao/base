package com.yyh.base.bootstrap.log;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;
import com.yyh.base.util.LocalThreadContext;
import com.yyh.base.util.constant.BaseConstant;

/**
 * 当前请求线程调用链token转换器
 * @author yeyinghao
 * @version 1.0.0
 * @date: 2022/5/26 13:32
 * @description: LogThreadTokenConvert.java
 */
public class LogThreadTokenConvert extends ClassicConverter {

	@Override
	public String convert(ILoggingEvent event) {
		return LogThreadTokenConvert.getThreadToken();
	}

	public static String getThreadToken() {
		String token = (String) LocalThreadContext.getContext().get(BaseConstant.TOKEN_KEY);
		if (token == null) {
			return genThreadToken();
		}
		return token;
	}

	public static void clearToken() {
		LocalThreadContext.getContext().remove(BaseConstant.TOKEN_KEY);
	}

	private static String genThreadToken() {
		long time = System.currentTimeMillis();
		long threadId = Thread.currentThread().getId();
		String token = time + "-" + threadId;
		LocalThreadContext.getContext().put(BaseConstant.TOKEN_KEY, token);
		return token;
	}

	public static void main(String[] args) {
		System.out.println(genThreadToken());
	}
}
