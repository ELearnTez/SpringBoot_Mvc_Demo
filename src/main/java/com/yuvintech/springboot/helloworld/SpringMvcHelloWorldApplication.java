package com.yuvintech.springboot.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringMvcHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcHelloWorldApplication.class, args);
	}

	@RestController
	public class HelloController {

		@GetMapping("hi")
		public String helloWorld() {
          return "Hello My Dear. Welcome to Spring Boot Application..!";
		}

	}
}
