package com.groovy.mysqldb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.groovy.mysqldb.mapper")
public class MysqlDbApplication {
    public static void main(String[] args) {
        SpringApplication.run(MysqlDbApplication.class, args);
    }

}
