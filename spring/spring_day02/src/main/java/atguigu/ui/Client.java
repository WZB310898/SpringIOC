package atguigu.ui;

import atguigu.dao.AccountDao;
import atguigu.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    /**
     * 模拟表现层
     *
     * @param args
     */
    public static void main(String[] args) {
        /**
         * 获取spring IOC的核心容器，并根据id获取对象
         */

        ApplicationContext ac =new ClassPathXmlApplicationContext("bean.xml");
        AccountService accountService = (AccountService) ac.getBean("accountService");
        AccountDao accountDao = ac.getBean("accountDao",AccountDao.class);
        accountService.saveAccount();
    }
}
