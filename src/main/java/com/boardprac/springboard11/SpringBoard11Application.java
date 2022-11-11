package com.boardprac.springboard11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringBoard11Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoard11Application.class, args);
	}

}
