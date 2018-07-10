package com.example.agenda;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import com.example.controlador.Controlador;
@ComponentScan(basePackageClasses=Controlador.class)
@SpringBootApplication
public class AgendaspringApplication extends SpringBootServletInitializer{
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(AgendaspringApplication.class);
	}
    public static void main(String[] args) {
        SpringApplication.run(AgendaspringApplication.class, args);
    }
}
