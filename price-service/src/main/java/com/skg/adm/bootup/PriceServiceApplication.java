package com.skg.adm.bootup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.skg.adm.config.RibbonConfiguration;



@SpringBootApplication
//@EnableEurekaClient
@RibbonClient(name = "product-service", configuration = RibbonConfiguration.class)
public class PriceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PriceServiceApplication.class, args);
	}
	
	  @LoadBalanced
	  @Bean
	  RestTemplate restTemplate(){
	  return new RestTemplate();
	  }

}
