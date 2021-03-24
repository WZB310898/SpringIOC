package com.v6.service.Impl;

import com.v6.dao.AtguiguDao;
import com.v6.domain.Account;
import com.v6.service.AtguiguService;

import java.util.List;

public class AtguiguServiceImpl implements AtguiguService {
    private AtguiguDao atguiguDao;

    public AtguiguDao getAtguiguDao() {
        return atguiguDao;
    }

    public void setAtguiguDao(AtguiguDao atguiguDao) {
        this.atguiguDao = atguiguDao;
    }

    public List<Account> findAccountList() {
        return atguiguDao.findAccountList();
    }

    public Account findAccountById(Integer id) {
        return atguiguDao.findAccountById(id);
    }

    public void saveAccount(Account account) {
        atguiguDao.saveAccount(account);
    }

    public void updateAccount(Account account) {
        atguiguDao.updateAccount(account);
    }

    public void deleteAccount(Integer id) {
        atguiguDao.deleteAccount(id);
    }
}
