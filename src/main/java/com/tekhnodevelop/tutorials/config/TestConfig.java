package com.tekhnodevelop.tutorials.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.tekhnodevelop.tutorials.service.DBService;

@Configuration
@Profile("test")
public class TestConfig {
	@Autowired
	private DBService dbServices;

	@Bean
	public void instantiateDatabase () {
		this.dbServices.instantiateDatabase();
	}
	
}
