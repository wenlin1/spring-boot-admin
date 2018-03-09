package com.patterncat;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.annotation.Configuration;

/**
 * spring-admin spring-boot监控启动类
 * @author wl
 * @description TODO
 * @date 2018年3月4日 上午11:09:34
 */
@Configuration
@EnableAutoConfiguration
@EnableAdminServer //开启Spring Boot Admin 服务
@EnableDiscoveryClient
@SpringBootApplication
@EnableTurbine
public class SpringbootAdminServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootAdminServerApplication.class, args);
	}
}
