package com.uin.src.dao;

import com.uin.src.bean.User;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.function.support.RouterFunctionMapping;

import javax.annotation.Resource;
import java.sql.JDBCType;
import java.util.List;

@Repository
public class UserJdbcDao {

     @Resource
     private JdbcTemplate primaryJdbcTemplate;
     public void save(User user){

     }

     public User findById(Long id){
          return   primaryJdbcTemplate.queryForObject("SELECT * FROM hello_uin.user where id=?", new Object[]{id}, new BeanPropertyRowMapper<>(User.class));
     }
}
