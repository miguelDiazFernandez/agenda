package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@ComponentScan(basePackageClasses=Controlador.class)
@ComponentScan("com.example")
@EntityScan(basePackages = "com.example.modelo")
@EnableJpaRepositories("com.example.dao")
@SpringBootApplication
public class AgendaspringApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(AgendaspringApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(AgendaspringApplication.class, args);
	}

}
