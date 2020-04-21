package com.uin.src.config;

import com.atomikos.jdbc.AtomikosDataSourceBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
     @Primary
     @Bean(name = "primaryDataSource",initMethod="init", destroyMethod="close")
     @ConfigurationProperties("primarydb")
     public DataSource primaryDataSource(){
          return new AtomikosDataSourceBean();
     }

     @Bean(name = "secondaryDataSource",initMethod="init", destroyMethod="close")
     @ConfigurationProperties("secondarydb")
     public DataSource secondaryDataSource(){
          return new AtomikosDataSourceBean();
     }

     @Bean
     public JdbcTemplate primaryJdbcTemplate(@Qualifier("primaryDataSource") DataSource dataSource){
          return new JdbcTemplate(dataSource);
     }

     @Bean
     public JdbcTemplate secondaryJdbcTemplate(@Qualifier("secondaryDataSource") DataSource dataSource){
         return new JdbcTemplate(dataSource);
     }

}

