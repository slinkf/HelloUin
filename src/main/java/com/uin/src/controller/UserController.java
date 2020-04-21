package com.uin.src.controller;

import com.uin.src.bean.User;
import com.uin.src.service.UserRestJdbcServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/article/user")
public class UserController {

     @Resource
     private UserRestJdbcServiceImpl service;

     @GetMapping("/{id}")
     private @ResponseBody
     User getUser(@PathVariable Long id){


          return service.getUser(id);
     }
}
