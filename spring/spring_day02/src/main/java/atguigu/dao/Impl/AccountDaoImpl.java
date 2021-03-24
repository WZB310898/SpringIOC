package atguigu.dao.Impl;

import atguigu.dao.AccountDao;

public class AccountDaoImpl implements AccountDao {

    private int i=0;
    public void saveAccount() {
        i++;
        System.out.println("保存了账户....");
        System.out.println(i);
    }
}
