package com.MahiChamp.Demo.of.Reactivejava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableReactiveMongoRepositories
public class DemoOfReactiveJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoOfReactiveJavaApplication.class, args);
	}

}
