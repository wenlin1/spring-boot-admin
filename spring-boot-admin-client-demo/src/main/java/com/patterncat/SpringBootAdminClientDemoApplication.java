package com.patterncat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

@Configuration
/*@EnableAdminServer //开启Spring Boot Admin 服务
@EnableDiscoveryClient*/
@SpringBootApplication
@EnableHystrix
@EnableHystrixDashboard
@EnableScheduling
@EnableCircuitBreaker
@EnableFeignClients
@EnableDiscoveryClient
public class SpringBootAdminClientDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAdminClientDemoApplication.class, args);
	}

	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
