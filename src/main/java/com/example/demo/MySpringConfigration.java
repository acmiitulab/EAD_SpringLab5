package com.example.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan("com.example.demo")
@PropertySource("/application.properties")
@EnableJpaRepositories(basePackages = "com.example.demo.repository")
public class MySpringConfigration { }
