package com.v5.test;

import com.v6.domain.Account;
import com.v6.service.AtguiguService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class testDemo {


    @Test
    public void test001() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        AtguiguService accountService = (AtguiguService) ac.getBean("accountService");
        List<Account> list = accountService.findAccountList();
        System.out.println(list);
    }
}
