package com.uin.src.service;

import com.uin.src.bean.User;

public interface UserRestService {
     User getUser(Long id);
     void updateUser(User user);
     void delUser(User user);
     User saveUser(User user);
}
