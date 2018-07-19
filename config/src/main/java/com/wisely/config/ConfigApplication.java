package com.wisely.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer //1-开启配置服务器的支持-配置中心
@EnableEurekaClient //2-开启对eureka客户端的支持
public class ConfigApplication {
	
	 public static void main(String[] args) {
	        SpringApplication.run(ConfigApplication.class, args);
	    }

}
