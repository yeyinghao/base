package com.yyh.code.bootstrap.log;

import ch.qos.logback.classic.PatternLayout;
import com.yyh.code.util.constant.BaseConstant;

/**
 * 日志装饰类，加入全局调用链唯一号
 * @author yeyinghao
 * @version 1.0.0
 * @date: 2022/5/26 13:31
 * @description: CustomPatternLayout.java
 */
public class CustomPatternLayout extends PatternLayout {
	static {
		defaultConverterMap.put(BaseConstant.TOKEN_KEY, LogThreadTokenConvert.class.getName());
	}
}