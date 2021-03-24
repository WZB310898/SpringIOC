package com.atguigu.service.Impl;

import com.atguigu.dao.AccountDao;
import com.atguigu.factory.BeanFactory;
import com.atguigu.service.AccountService;

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl implements AccountService {

    //private AccountDao accountDao = new AccountDaoImpl();

    private AccountDao accountDao = (AccountDao) BeanFactory.getBean("accountDao");

    public void saveAccount() {
        accountDao.saveAccount();
    }
}
