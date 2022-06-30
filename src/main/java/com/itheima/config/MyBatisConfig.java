package com.itheima.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class MyBatisConfig {
    //factorybean是用来造对象的 为了创建sqlsession对象
    //使用@bean注解的第三方bean要注入引用类型 在参数中添加
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource){
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setTypeAliasesPackage("com.itheima.domain");
        return factoryBean;
    }

    //SqlSession创建后用来  使用自动代理的格式把我们创建实现类
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setBasePackage("com.itheima.dao");
        return msc;
    }

}

//替代了以下之前写在xml的配置文件
//<?xml version="1.0" encoding="utf8"?>
//<!DOCTYPE configuration
//        PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
//        "http://mybatis.org/dtd/mybatis-3-config.dtd">
//<!--mybatis核心配置文件 替换连接信息解决硬编码-->
//<configuration>
//    <typeAliases>
//        <package name="com.itheima.pojo"/>
//    </typeAliases>
//
//    <environments default="development">
//        <environment id="development">
//            <transactionManager type="JDBC"></transactionManager>
//            <dataSource type="POOLED">
//                <!--数据库的连接信息-->
//                <property name="driver" value="com.mysql.jdbc.Driver"/>
//                <property name="url" value="jdbc:mysql://localhost:3306/db01?useSSL=false&amp;useServerPrepStmts=TRUE&amp;characterEncoding=UTF-8"/>
//                <property name="username" value="root"/>
//                <property name="password" value="1234"/>
//            </dataSource>
//        </environment>
//    </environments>
//
//    <mappers>
//        <!--加载SQL的映射文件-->
//        <!--<mapper resource = "com/itheima/mapper/BrandMapper.xml">-->
//        <!--用了mapper代理方式后可以用扫描方式-->
//        <package name="com.itheima.mapper"/>
//    </mappers>
//</configuration>