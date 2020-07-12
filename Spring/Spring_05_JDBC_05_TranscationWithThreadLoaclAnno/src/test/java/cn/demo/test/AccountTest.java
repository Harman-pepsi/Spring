package cn.demo.test;

import cn.demo.config.SpringConfig;
import cn.demo.entry.Account;
import cn.demo.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Classname AccountTest
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/13 3:57
 * @Version V1.0.0
 * @Since 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class AccountTest {

    @Autowired
    private IAccountService accountService;

    @Test
    public void testAccountService(){
        int tranfer = accountService.tranfer(1, 2, 1000.0d);
        System.out.println(tranfer == 2 ? "转账成功!" : "转账失败!");
    }

    @Test
    public void testFind(){
        List<Account> accountAll = accountService.findAccountAll();
        for (Account account : accountAll) {
            System.out.println(account);
        }
    }
}
