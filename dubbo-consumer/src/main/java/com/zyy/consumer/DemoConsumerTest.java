package com.zyy.consumer;

import com.zyy.demo.api.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class DemoConsumerTest {

    private static Logger logger = LoggerFactory.getLogger(DemoConsumerTest.class);

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:dubbo-consumer.xml");
        context.start();
        DemoService demoService = context.getBean("demoService", DemoService.class);
        demoService.say("hello world");
        System.in.read();//阻塞
    }
}
