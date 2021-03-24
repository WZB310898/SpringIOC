package com.v6.dao;

import com.v6.domain.Account;

import java.util.List;

public interface AtguiguDao {

    List<Account> findAccountList();

    Account findAccountById(Integer id);


    void saveAccount(Account account);


    void updateAccount(Account account);


    void deleteAccount(Integer id);
}
