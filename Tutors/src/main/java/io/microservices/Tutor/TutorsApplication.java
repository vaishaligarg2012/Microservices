package io.microservices.Tutor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TutorsApplication { 

	public static void main(String[] args) {
		SpringApplication.run(TutorsApplication.class, args);
	}  

}  
 