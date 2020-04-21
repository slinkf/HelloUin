package com.uin.src.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.uin.src.bean.Articles;
import com.uin.src.service.ArticlesRestJdbcServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Slf4j //不知道有什么卵用
@RestController
@RequestMapping("/article")
public class ArticleController {

     @Resource
     ArticlesRestJdbcServiceImpl articlesRestJdbcService;

     private List<Articles> list = new ArrayList<>();

     @GetMapping("/{id}")
     private @ResponseBody Articles getArticles(@PathVariable Long id){

          return articlesRestJdbcService.get(id);
     }

     @PostMapping(value = "/add",produces = "application/json")
     private String  addArticles(@RequestBody Articles articles){
          list.add(articles);
          log.info("articles{}",articles);
          return "添加成功 size ="+list.size();
     }

     @PutMapping("/{id}")
     private String updateArticles(@PathVariable int id,@RequestBody Articles articles){
          if(list.size()<=id){
               return "articles 不存在";
          }
          list.set(id,articles);

          return "修改成功 name="+list.get(id).getTitle();
     }

     @DeleteMapping("/{id}")
     private String delArticles(@PathVariable  int id){
          if(list.size()<=id){
               return "articles 不存在";
          }
          list.remove(id);
          return "删除成功 name="+list.get(id).getTitle();
     }

}
