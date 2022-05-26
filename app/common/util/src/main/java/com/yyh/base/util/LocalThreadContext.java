package com.yyh.base.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LocalThreadContext {
	private static final ThreadLocal<Map<String, String>> context = ThreadLocal.withInitial(HashMap::new);

	public static Map<String, String> getContext() {
		return context.get();
	}
}
