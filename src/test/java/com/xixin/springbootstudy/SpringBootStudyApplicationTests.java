package com.xixin.springbootstudy;

import com.xixin.springbootstudy.bean.Person;
import com.xixin.springbootstudy.bean.Pp;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;


@SpringBootTest
class SpringBootStudyApplicationTests {
    Logger log = (Logger) LoggerFactory.getLogger(getClass());
    @Test
    void contextLoads() {
        // 日志级别，由低到高，
        // 可以调整输出的日志级别，设置后就只输出这个级别及以后的高级别
        log.trace("这是trace日志。。。");
        log.debug("这是debug日志。。。");
        // springboot默认输出的是info级别的
        log.info("这是info日志。。。");
        log.warn("这是warn日志。。。");
        log.error("这是error日志。。。");
    }
    @Autowired
    Person person;
    @Autowired
    Pp pp;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void testHelloService(){
        boolean b = ioc.containsBean("helloService");
        System.out.println(b);
    }



}
