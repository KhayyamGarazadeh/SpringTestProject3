package com.example.springtestproject3.controller;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;
@Slf4j
@RestController
@RequestMapping("v1/users")
public class TestController {

    Logger logger=Logger.getLogger(String.valueOf(TestController.class));

    @GetMapping("/hello")
    public String hello(){

        log.info("MyLog starts ");
        log.info("MyLog ended");
        return "Hello MS15";
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void show(){
        log.error("Fatal error");
        log.warn("Application may throw error");
    }


//    private final TestService testService;
//
//    public TestController(TestService testService) {
//        this.testService = testService;
//    }
//        public void testM(){
//       //     testService.test();
//        }

}
