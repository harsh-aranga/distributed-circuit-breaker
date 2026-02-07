package com.pragmaticbyharsh.circuitbreaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DistributedCircuitBreakerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DistributedCircuitBreakerApplication.class, args);
	}

}
