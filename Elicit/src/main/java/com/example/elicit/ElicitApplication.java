package com.example.elicit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.sql.Connection;
import java.sql.DriverManager;

@SpringBootApplication
@EntityScan
// @SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class ElicitApplication {

    public static Logger logger = LoggerFactory.getLogger(ElicitApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(ElicitApplication.class, args);
    }
}
