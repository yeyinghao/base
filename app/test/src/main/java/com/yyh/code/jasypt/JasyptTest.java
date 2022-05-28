package com.yyh.code.jasypt;

import org.jasypt.util.text.BasicTextEncryptor;

/**
 * 加解密
 */
public class JasyptTest {
	public static void main(String[] args) {
		BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
		//加密所需的salt(盐)
		textEncryptor.setPassword("jasypt");
		//要加密的数据（数据库的用户名或密码）
		String encrypt = textEncryptor.encrypt("Abc191935.");
		System.out.println(textEncryptor.decrypt(encrypt));
		System.out.println("ENC(" + encrypt + ")");
	}
}
