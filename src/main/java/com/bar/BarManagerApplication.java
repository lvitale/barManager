package com.bar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication 
@EnableAutoConfiguration
@ComponentScan(basePackages="com.bar")
@EnableJpaRepositories(basePackages="com.bar.repository")
@EnableTransactionManagement
@EntityScan(basePackages="com.bar.entity")
public class BarManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BarManagerApplication.class, args);
	}
	

}
