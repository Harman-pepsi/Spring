package cn.demo.test;

import cn.demo.entry.Account;
import cn.demo.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Classname C3p0Test
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/11 11:28
 * @Version V1.0.0
 * @Since 1.0
 */
public class C3p0Test {

    @Test
    public void testC3p0(){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
        IAccountService accountService = context.getBean("accountService", IAccountService.class);
        List<Account> accountAll = accountService.findAccountAll();
        for (Account account : accountAll) {
            System.out.println(account);
        }

        Account accountById = accountService.findAccountById(1);
        System.out.println(accountById);
    }
}
