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
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection conn = DriverManager.getConnection(
//                    "jdbc:mysql://aws.connect.psdb.cloud/masterdb?sslMode=IDENTITY_VERIFY",
//                    "r6arugmqzxhe5pu8okfs",
//                    "pscale_pw_oowtKki0ded4uN2LaMAtgiJfdscR5dXNNYPeXZs9cvq");
//            conn.close();
//            System.out.println("Successfully connected to PlanetScale!");
//        } catch(Exception e) {
//            e.printStackTrace();
//            System.exit(1);
//        }
        SpringApplication.run(ElicitApplication.class, args);
    }
}
