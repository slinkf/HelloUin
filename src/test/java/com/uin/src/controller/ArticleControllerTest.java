package com.uin.src.controller;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//create by command + shift + t


@Slf4j
@SpringBootTest
class ArticleControllerTest {

     private MockMvc mockMvc;
     @BeforeEach
     public void setUp(){
          mockMvc =  MockMvcBuilders
                  .standaloneSetup(new ArticleController())
                  .build();
     }

     @Test
     public void saveArticle() throws Exception{
          String article ="{\n" +
                  "  \n" +
                  "    \"name\":\"百度\",\n" +
                  "    \"path\":\"https://www.baidu.com\"\n" +
                  "  \n" +
                  "}";

        /*  mockMvc.perform(
           *//*       MockMvcRequestBuilders.request(HttpMethod.POST,"article/add")
                          .contentType("application/json").content(article).anMockMvcResultMatchers.status().isOk())
                          .andExpect(MockMvcResultMatchers.jsonPath("$.data.author").value("zimug"))
                          .andExpect(MockMvcResultMatchers.jsonPath("$.data.reader[0].age").value(18))
                          .andDo(print())
                          .andReturn();*//*
          )*/
     }
}