package com.v6.test;

import com.v6.domain.Account;
import com.v6.service.AtguiguService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Client {

    @Test
    public void test001() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        AtguiguService accountService = (AtguiguService) ac.getBean("atguiguService");
        List<Account> list = accountService.findAccountList();
        System.out.println(list);
    }


    @Test
    public void test002() {

        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        AtguiguService accountService = (AtguiguService) ac.getBean("atguiguService");
        Account account= accountService.findAccountById(2);
        System.out.println(account);
    }

    @Test
    public void test003() {
        Account account =new Account();
        account.setName("sssdd");
        account.setMoney((float) 1.22);
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        AtguiguService accountService = (AtguiguService) ac.getBean("atguiguService");
        accountService.saveAccount(account);
    }
}
