package com.assesment.assesmentsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EntityScan(basePackages = {"com.assesment.assesmentsystem.data.entities","com.assesment.assesmentsystem.data.repositories","com.assesment.assesmentsystem.controllers"})
public class AssesmentsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssesmentsystemApplication.class, args);
	}

}
