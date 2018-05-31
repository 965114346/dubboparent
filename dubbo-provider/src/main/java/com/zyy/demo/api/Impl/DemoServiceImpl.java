package com.zyy.demo.api.Impl;

import com.zyy.demo.api.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class DemoServiceImpl implements DemoService {

    private static Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);

    public String say(String words) {
        logger.debug("the words: {}",words);
        return "hello "+words;
    }

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:dubbo-provider.xml");
        context.start();
        logger.debug("dubbo-provider: {}","注册服务!");
        System.in.read();//阻塞
    }
}
