package com.uin.src.service;

import com.uin.src.bean.Articles;
import com.uin.src.dao.ArticlesJdbcDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
public class ArticlesRestJdbcServiceImpl implements ArticlesRestService {
     @Resource
     ArticlesJdbcDao dao;
     @Override
     public Articles get(Long id) {
          return dao.findById(id);
     }
}
