package com.study.springboot202210haehyuk.IocAndDi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
// bean 등록을 수동으로 등록 하고 싶을 때 쓰인다.
@Configuration
public class TestConfig {

    @Bean
    public Test1 t1() {
        return new Test1();
    }

    @Bean
    public Test2 t2() {
        return new Test2();
    }
}
