package com.uin.src.dao;

import com.uin.src.bean.Articles;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class ArticlesJdbcDao {
     @Resource
     JdbcTemplate articlesJdbcTemplate;

     public Articles findById(Long id){
         return   articlesJdbcTemplate.queryForObject("SELECT * FROM hello_articles.articles where id=?",new Object[]{id}, new BeanPropertyRowMapper<>(Articles.class));
     }
}
