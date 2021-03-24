package com.v6.dao.Impl;

import com.v6.dao.AtguiguDao;
import com.v6.domain.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class AtguiguDaoImpl implements AtguiguDao {


    private QueryRunner queryRunner;


    public void setQueryRunner(QueryRunner queryRunner) {
        this.queryRunner = queryRunner;
    }

    public List<Account> findAccountList() {
        try {
            return queryRunner.query("select * from account", new BeanListHandler<Account>(Account.class));
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
    }

    public Account findAccountById(Integer id) {
        try {
            return queryRunner.query("select * from account where id =?", new BeanHandler<Account>(Account.class),id);
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
    }

    public void saveAccount(Account account) {
        try {
             queryRunner.update("insert into account (name,money) values (?,?)",account.getName(),account.getMoney());
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
    }

    public void updateAccount(Account account) {
        try {
            queryRunner.update("update  account  set name =? , money=? where id =?",account.getName(),account.getMoney(),account.getId());
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
    }

    public void deleteAccount(Integer id) {
        try {
            queryRunner.update("delete from   account   where id =?",id);
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
    }
}
