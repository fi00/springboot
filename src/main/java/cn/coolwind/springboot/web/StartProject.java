package cn.coolwind.springboot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "cn.coolwind.springboot")
public class StartProject {
    public static void main(String[] args) {
        SpringApplication.run(StartProject.class, args);
    }
}
