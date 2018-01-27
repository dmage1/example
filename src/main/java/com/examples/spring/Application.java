package com.examples.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application implements CommandLineRunner {

    //@Value("${bean.name}") String beanName;

    @Override
    public void run(String... args) throws Exception {
        //System.out.println(beanName);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
