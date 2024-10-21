package com.example.UberProject_AuthService2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class UberProjectAuthService2Application {

	public static void main(String[] args) {
		SpringApplication.run(UberProjectAuthService2Application.class, args);
	}

}
