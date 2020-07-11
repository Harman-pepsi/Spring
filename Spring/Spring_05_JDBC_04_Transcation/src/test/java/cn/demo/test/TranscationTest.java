package cn.demo.test;

import cn.demo.entry.Account;
import cn.demo.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Classname TranscationTest
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/11 15:48
 * @Version V1.0.0
 * @Since 1.0
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath:SpringConfig.xml")
public class TranscationTest {

    //@Autowired
    //private IAccountService accountService;

    @Test
    public void testTranscation(){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
        IAccountService accountService = context.getBean("accountService", IAccountService.class);
        List<Account> accountAll = accountService.findAccountAll();
        for (Account account : accountAll) {
            System.out.println(account);
        }

        Account accountById = accountService.findAccountById(1);
        System.out.println(accountById);

        Account account = new Account(1,"Jack",10000.0d);
        int i = accountService.updateAccount(account);
        System.out.println(i > 0 ? "更新成功!" : "更新失败!");

        Account accountById2 = accountService.findAccountById(1);
        System.out.println(accountById2);
    }

    @Test
    public void testTranfer(){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
        IAccountService accountService = context.getBean("accountService", IAccountService.class);
        int tranfer = accountService.tranfer(1, 2, 2500.0d);
        System.out.println(tranfer == 2 ? "转账成功!" : "转账失败!");

        List<Account> accountAll = accountService.findAccountAll();
        for (Account account : accountAll) {
            System.out.println(account);
        }
    }

    @Test
    public void testSpring(){
//        List<Account> accountAll = accountService.findAccountAll();
//        for (Account account : accountAll) {
//            System.out.println(account);
//        }


    }

}
