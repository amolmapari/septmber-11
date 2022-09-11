package com.ait.jdbc;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

@SpringBootApplication
public class Application {

	
	@Autowired
	DataSource dataSource;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public SimpleJdbcCall simpleCall() {
		return new SimpleJdbcCall(dataSource);
	}

}
