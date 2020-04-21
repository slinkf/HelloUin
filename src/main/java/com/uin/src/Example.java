package com.uin.src;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//通常放到主类上
@EnableAutoConfiguration
public class Example {

    //

    @RequestMapping("/hello")
    String home() throws Exception{
        return "hello uin";
    }

    public static void main(String[] args) {
        //主程序
        SpringApplication.run(Example.class,args);
    }
}
