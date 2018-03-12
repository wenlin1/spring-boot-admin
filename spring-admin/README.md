#                                          spring-boot-admin 监控服务 版本v0.0.1


##功能包括：    
1.显示 name/id 和版本号.      
2.显示在线状态.    
3.Logging日志级别管理    
4.JMX beans管理    
5.Threads会话和线程管理    
6.Trace应用请求跟踪    
7.应用运行参数信息   
8.Java 系统属性    
9.Java 环境变量属性    
10.内存信息   
11.Spring 环境属性
## 工程搭建和简介
### 一、构建service-admin工程，pom如下：  
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	
	
	<modelVersion>4.0.0</modelVersion>
	<groupId>com.patterncat</groupId>
	<artifactId>springboot-admin-server</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<packaging>jar</packaging>
	<name>springboot-admin-server</name>
	<description>Demo project for Spring Boot</description>
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>1.5.5.RELEASE</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>
	<properties>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<java.version>1.8</java.version>
	</properties>
	<dependencies>
		<!-- http://codecentric.github.io/spring-boot-admin/1.3.2/#getting-started -->
		<dependency>
			<groupId>de.codecentric</groupId>
			<artifactId>spring-boot-admin-server</artifactId>
			<version>1.5.5</version>
		</dependency>
		<dependency>
			<groupId>de.codecentric</groupId>
			<artifactId>spring-boot-admin-server-ui</artifactId>
			<version>1.5.5</version>
		</dependency>
		<dependency>
			<groupId>de.codecentric</groupId>
			<artifactId>spring-boot-admin-server-ui-login</artifactId>
			<version>1.5.5</version>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
			<version>1.5.5.RELEASE</version>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-actuator</artifactId>
		</dependency>	
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>
	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>
</project>


### 二、启动主类：

package com.lovnx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;

import de.codecentric.boot.admin.config.EnableAdminServer;

@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableAdminServer
public class SpringBootAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdminApplication.class, args);
    }
}

### 三、配置文件application.properties：  

spring.application.name=spring-admin  
server.port = 8099  
spring.jackson.serialization.indent_output=true   
management.security.enabled=false   
security.user.name=leadeon   
security.user.password=admin   
security.basic.enabled=false   
endpoints.health.sensitive=true   
spring.boot.admin.url=http://localhost:8099  
spring.boot.admin.turbine.location=spring-admin  
spring.boot.admin.turbine.clusters=default  
spring.boot.admin.turbine.enabled=true   
spring.boot.admin.routes.endpoints=env,metrics,trace,dump,jolokia,info,configprops,trace,logfile,refresh,flyway,liquibase,heapdump,loggers,auditevents,hystrix.stream,turbine.stream   
turbine.appConfig=spring-client,SPRING-ADMIN  
turbine.combineHostPort=true  
turbine.clusterNameExpression=new String("default")  
spring.boot.admin.turbine.url=/turbine.stream    
eureka.client.serviceUrl.defaultZone= http://localhost:8080/eureka/    

### 四、logback.xml(实现日志级别修改功能)：  
<configuration>
    <include resource="org/springframework/boot/logging/logback/base.xml"/>
    <jmxConfigurator/>
</configuration>

*/





