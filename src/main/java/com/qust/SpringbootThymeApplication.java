package com.qust;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qust.mapper")
public class SpringbootThymeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootThymeApplication.class, args);
    }

}
