package com.uin.src.controller;

import com.uin.src.bean.LimitBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//写一个控制器  超级简单
@RestController
public class HelloController {



     @Autowired
     LimitBean limitBean;

     @GetMapping("/sayHello")
     public String sayHello(){
          return "hello Controller"+limitBean.getDesc();
     }
}
