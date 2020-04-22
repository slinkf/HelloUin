package com.uin.src.controller;

import com.uin.src.bean.User;
import com.uin.src.bean.User2;
import com.uin.src.service.UserRestJdbcServiceImpl;
import org.dozer.DozerBeanMapperBuilder;
import org.dozer.Mapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/article/user")
public class UserController {

     Mapper mapper = DozerBeanMapperBuilder.buildDefault();
     @Resource
     private UserRestJdbcServiceImpl service;

     @GetMapping("/{id}")
     private @ResponseBody
     User2 getUser(@PathVariable Long id){

          return mapper.map(service.getUser(id),User2.class);
     }
}
