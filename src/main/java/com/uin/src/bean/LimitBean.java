package com.uin.src.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@ConfigurationProperties(prefix = "limit")
public class LimitBean {
     private BigDecimal minMoney;
     private String desc;


     public BigDecimal getMinMoney() {
          return minMoney;
     }

     public void setMinMoney(BigDecimal minMoney) {
          this.minMoney = minMoney;
     }

     public String getDesc() {
          return desc;
     }

     public void setDesc(String desc) {
          this.desc = desc;
     }
}
