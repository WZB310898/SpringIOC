package atguigu.service.Impl;

import atguigu.dao.AccountDao;
import atguigu.dao.Impl.AccountDaoImpl;
import atguigu.service.AccountService;


/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao =null;


    public void saveAccount() {
        accountDao.saveAccount();
    }
}
