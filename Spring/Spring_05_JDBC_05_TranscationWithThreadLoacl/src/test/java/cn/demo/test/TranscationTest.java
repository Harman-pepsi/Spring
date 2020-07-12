package cn.demo.test;

import cn.demo.dao.IAccountDao;
import cn.demo.entry.Account;
import cn.demo.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Classname TranscationTest
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/13 2:32
 * @Version V1.0.0
 * @Since 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:SpringConfig.xml"})
public class TranscationTest {

    @Autowired
    private IAccountDao accountDao;
    @Autowired
    private IAccountService accountService;

    @Test
    public void testAccountDao(){
        List<Account> accountAll = accountDao.findAccountAll();
        for (Account account : accountAll) {
            System.out.println(account);
        }

        Account accountById = accountDao.findAccountById(1);
        System.out.println(accountById);
    }

    @Test
    public void testAccountService(){
        List<Account> accountAll = accountService.findAccountAll();
        for (Account account : accountAll) {
            System.out.println(account);
        }
    }

    @Test
    public void testTranfer(){
        int tranfer = accountService.tranfer(1, 2, 1000.0d);
        System.out.println((tranfer == 2) ? "转账成功!" : "转账失败!");
        List<Account> accountAll = accountService.findAccountAll();
        for (Account account : accountAll) {
            System.out.println(account);
        }
    }
}
