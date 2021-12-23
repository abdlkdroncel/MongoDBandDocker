package com.mongodb.mongospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class MongospringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongospringApplication.class, args);
	}

}
