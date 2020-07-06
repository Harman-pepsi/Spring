package cn.demo.test;

import cn.demo.factory.BeanFactory;
import cn.demo.service.IAccountService;
import org.junit.Test;

/**
 * @Classname AccountTest
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/6 10:16
 * @Version V1.0.0
 * @Since 1.0
 */
public class AccountTest {

    @Test
    public void testAccountOfSingleton(){
        for (int i = 0; i < 5; i++) {
            IAccountService accountService = (IAccountService) BeanFactory.getBeanOfSingleton("accountService");
            System.out.println(accountService);
            accountService.saveAccount();

        }
    }

    @Test
    public void testAccountOfProperty(){
        for (int i = 0; i < 5; i++) {
            IAccountService accountService = (IAccountService) BeanFactory.getBeanOfProperty("accountService");
            System.out.println(accountService);
            accountService.saveAccount();
        }
    }
}
