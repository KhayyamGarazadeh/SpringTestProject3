package com.example.springtestproject3;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringTestProject3Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringTestProject3Application.class, args);
    }

//
//    @PostConstruct
//    public void test(){
//        TestService testService=new TestService();
//        testService.sendNotification(1L,"SMS");
//    }
}
