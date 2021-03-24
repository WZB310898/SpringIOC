package com.v6.service;

import com.v6.domain.Account;

import java.util.List;

public interface AtguiguService {


    List<Account> findAccountList();

    Account findAccountById(Integer id);


    void saveAccount(Account account);


    void updateAccount(Account account);


    void deleteAccount(Integer id);
}


