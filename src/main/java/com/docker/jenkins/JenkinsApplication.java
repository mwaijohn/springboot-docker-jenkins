package com.docker.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@SpringBootApplication
@RestController
public class JenkinsApplication {

	@GetMapping("/")
	public String test(){
		return "WORKING: " + new Date();
	}
	public static void main(String[] args) {
		SpringApplication.run(JenkinsApplication.class, args);
	}

}
