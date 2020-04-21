package com.uin.src.service;

import com.uin.src.bean.User;
import com.uin.src.dao.UserJdbcDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
public class UserRestJdbcServiceImpl implements UserRestService {
     @Resource
     UserJdbcDao dao;
     @Override
     public User getUser(Long id) {
       return    dao.findById(id);
     }

     @Override
     public void updateUser(User user) {

     }

     @Override
     public void delUser(User user) {

     }

     @Override
     public User saveUser(User user) {
          return null;
     }
}
