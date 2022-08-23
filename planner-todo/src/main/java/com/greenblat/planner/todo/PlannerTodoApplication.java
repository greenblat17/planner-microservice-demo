package com.greenblat.planner.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = {"com.greenblat.planner"})
@EnableJpaRepositories(basePackages = {"com.greenblat.planner.todo"})
public class PlannerTodoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlannerTodoApplication.class, args);
    }

}
