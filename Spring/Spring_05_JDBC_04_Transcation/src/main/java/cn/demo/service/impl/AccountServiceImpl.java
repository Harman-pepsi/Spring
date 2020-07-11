package cn.demo.service.impl;

import cn.demo.dao.IAccountDao;
import cn.demo.entry.Account;
import cn.demo.service.IAccountService;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

/**
 * @Classname AccountServiceImpl
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/10 12:05
 * @Version V1.0.0
 * @Since 1.0
 */
public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public List<Account> findAccountAll() {
        return accountDao.findAccountAll();
    }

    @Override
    public Account findAccountById(Integer acid) {
        return accountDao.findAccountById(acid);
    }

    @Override
    public int saveAccount(Account account) {
        return accountDao.saveAccount(account);
    }

    @Override
    public int deleteAccountById(Integer acid) {
        return accountDao.deleteAccountById(acid);
    }

    @Override
    public int updateAccount(Account account) {
        return accountDao.updateAccount(account);
    }

    @Override
    public int tranfer(Integer fromId, Integer toId,Double money) {
        Account fromAccount = this.findAccountById(fromId);
        Account toAccount = this.findAccountById(toId);
        fromAccount.setBalance(fromAccount.getBalance() - money);
        toAccount.setBalance(toAccount.getBalance() + money);
        int i = accountDao.updateAccount(fromAccount);
        int j = 1/0;
        i += accountDao.updateAccount(toAccount);
        return i;
    }
}
