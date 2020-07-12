package cn.demo.service.impl;

import cn.demo.dao.IAccountDao;
import cn.demo.entry.Account;
import cn.demo.service.IAccountService;

import java.util.List;

/**
 * @Classname AccountServiceImpl
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/12 14:29
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
    public int tranfer(Integer fromId, Integer targetId, Double money) {
        Account fromAccount = accountDao.findAccountById(fromId);
        Account targetAccount = accountDao.findAccountById(targetId);
        fromAccount.setBalance(fromAccount.getBalance() - money);
        targetAccount.setBalance(targetAccount.getBalance() + money);
        int i = accountDao.updateAccount(fromAccount);
        int j = 1 / 0;
        i += accountDao.updateAccount(targetAccount);
        return i;
    }
}
