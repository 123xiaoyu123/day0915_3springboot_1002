package com.baidu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//@MapperScan(basePackages = {""})可为空 两种写法 下面的也是
@MapperScan("com.baidu.mapper")
public class DaySpringboot1002Application {

    public static void main(String[] args) {
        SpringApplication.run(DaySpringboot1002Application.class, args);
    }

}
