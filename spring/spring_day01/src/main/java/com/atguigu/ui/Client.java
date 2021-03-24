package com.atguigu.ui;

import com.atguigu.factory.BeanFactory;
import com.atguigu.service.AccountService;

public class Client {

    /**
     * 模拟表现层
     * @param args
     */
    public static void main(String[] args) {
        //AccountService accountService = new AccountServiceImpl();

        for (int i = 0; i < 5; i++) {
            AccountService accountService= (AccountService) BeanFactory.getBean("accountService");
            accountService.saveAccount();
        }

    }
}
