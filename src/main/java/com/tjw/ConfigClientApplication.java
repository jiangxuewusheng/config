package com.tjw;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**  
* @Title: ConfigClientApplication.java  
* @Package com.tjw  
* @Description: 客戶端-使用配置中心微服务
* @author by tangjw  
* @date 2018年6月7日  
* @version V1.0  
*/

@RefreshScope
@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigClientApplication {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ConfigClientApplication.class, args);
	}

	@Value("${foo}")
	String foo;

	@RequestMapping(value="/hi")
	public String hi() {
		return foo;
	}
	
}
