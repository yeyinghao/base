//package com.yyh.base.bootstrap.mybatis;
//
//import com.baomidou.mybatisplus.annotation.DbType;
//import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
//import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
//import org.aopalliance.intercept.Interceptor;
//import org.apache.ibatis.session.ExecutorType;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import javax.sql.DataSource;
//
//@Configuration
//public class Config {
//
//	@Autowired
//	@Qualifier("dataSource")
//	private DataSource dataSource;
//
//	@Bean
//	//判定配置文件中的配置属性
//	@ConfigurationProperties(prefix = "mybatis-plus")
//	public SqlSessionFactory sqlSessionFactory() throws Exception {
//		MybatisSqlSessionFactoryBean sqlSessionFactoryBean = new MybatisSqlSessionFactoryBean();
//		//设置数据源
//		sqlSessionFactoryBean.setDataSource(dataSource);
////        MybatisConfiguration mybatisConfiguration = new MybatisConfiguration();
//		//取消驼峰命名转换
////        mybatisConfiguration.setMapUnderscoreToCamelCase(false);
////        sqlSessionFactoryBean.setConfiguration(mybatisConfiguration);
//		//返回SqlSessionFactory
//		//设置分页插件
////		sqlSessionFactoryBean.setPlugins(new Interceptor[]{paginationInterceptor()});
//		return sqlSessionFactoryBean.getObject();
//	}
//}
