package cn.demo.test;

import cn.demo.dao.IAccountDao;
import cn.demo.dao.impl.AccountDaoImpl;
import cn.demo.entry.Account;
import cn.demo.service.IAccountService;
import cn.demo.service.impl.AccountServiceImpl;

import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

/**
 * @Classname DBTest
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/10 15:12
 * @Version V1.0.0
 * @Since 1.0
 */
public class DBTest {

    @Test
    public void testDB() throws SQLException {
        IAccountService accountService = new AccountServiceImpl(new AccountDaoImpl());
        List<Account> accountAll = accountService.findAccountAll();
        for (Account account : accountAll) {
            System.out.println(account);
        }

        Account accountById = accountService.findAccountById(1);
        System.out.println(accountById);
    }
}
