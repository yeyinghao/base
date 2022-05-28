package com.yyh.code.dal.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("sys_user")
@Data
public class User {
	private Long id;
	private String name;
	private Integer age;
	private String email;
}