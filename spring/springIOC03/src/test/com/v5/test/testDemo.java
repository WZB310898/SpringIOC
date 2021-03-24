package com.v5.test;

import com.v6.domain.Account;
import com.v6.service.AtguiguService;
import config.SpringConfiguration;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 1.导入spring 整合的junit的jar坐标
 * 2.使用junit提供的一个注解把原有的main方法替换了，替换成spring提供的@RunWith
 * 3.告知spring容器，spring和ioc创建是基于xml还是注解的，并且说明位置
 *      @ContextConfiguration
 *           locations:指定xml文件的位置，加上classpath关键字，表示在类路径下
 *           classes: 指定注解类所在的位置
 *
 *  当我们使用spring 5.x版本的时候，要求junit的jar必须是4.1.2及以上
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
//@ContextConfiguration(locations ="classpath:bean.xml")
public class testDemo {



/*
    private ApplicationContext ac;
    private AtguiguService accountService;

    @Before
    public void init() {
        ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        accountService = (AtguiguService) ac.getBean("accountService");
    }
*/



    @Autowired
    private AtguiguService accountService=null;


    @Test
    public void test001() {
        //ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class, jdbcConfig.class);
        List<Account> list = accountService.findAccountList();
        System.out.println(list);
        Integer a = 1000;
        Integer b = 1000;
        Integer c = 12;
        Integer d = 12;
        System.out.println(a == b);
        System.out.println(c == d);



    }

    @Test
    public void test002() {
        //ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        Account account = accountService.findAccountById(1);
        System.out.println(account);
    }
}
