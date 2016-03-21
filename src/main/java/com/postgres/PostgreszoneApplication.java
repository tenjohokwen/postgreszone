package com.postgres;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class PostgreszoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostgreszoneApplication.class, args);
	}
}
