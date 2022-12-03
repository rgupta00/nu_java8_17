package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
 * <context:annotation-config/>
	<context:component-scan base-package="com.demo"/>
 */
@Configuration
@ComponentScan(basePackages = {"com.demo"})
public class AppConfig {

}
