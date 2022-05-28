package com.yyh.code.util;

import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;

public class JasyptUtil {

	/**
	 * Jasypt生成加密结果
	 * @param password 配置文件中设定的加密密
	 * @param value 加密值
	 * @return
	 */
	public static String encyptPwd(String password,String value){
		PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
		encryptor.setConfig(cryptor(password));
		return encryptor.encrypt(value);
	}

	/**
	 * 解密
	 * @param password 配置文件中设定的加密密码
	 * @param value 解密密文
	 * @return
	 */
	public static String decyptPwd(String password,String value){
		PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
		encryptor.setConfig(cryptor(password));
		return encryptor.decrypt(value);
	}

	public static SimpleStringPBEConfig cryptor(String password){
		SimpleStringPBEConfig config = new SimpleStringPBEConfig();
		config.setPassword(password);
		config.setAlgorithm("PBEWithMD5AndDES");
		config.setPoolSize("1");
		return config;
	}


}
