package com.devopsintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController("/devops-integration")
public class DevOpsSpringBootApplication {

	@GetMapping
	public String getMessage(){
		return "First Docker Application";
	}

	public static void main(String[] args) {
		SpringApplication.run(DevOpsSpringBootApplication.class, args);
	}

}
