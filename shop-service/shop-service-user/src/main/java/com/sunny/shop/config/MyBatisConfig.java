package com.sunny.shop.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * mybatis 扫描配置文件
 */
@Configuration
@MapperScan("com.sunny.user.mapper")
public class MyBatisConfig {
}
