package com.example.songsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@RestController
@SpringBootApplication
public class UsersApiApplication {

	@RequestMapping("/testing")
	public String home() {
		return "test this";
	}

	public static void main(String[] args) {
		SpringApplication.run(UsersApiApplication.class, args);
	}

}
