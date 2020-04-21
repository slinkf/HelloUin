package com.uin.src.service;

import com.uin.src.bean.Articles;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

public interface ArticlesRestService {
     Articles get(Long id);
}
