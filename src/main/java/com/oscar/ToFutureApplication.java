package com.oscar;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan
@Slf4j
public class ToFutureApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToFutureApplication.class, args);
        log.info("Start Success!");
    }

}
