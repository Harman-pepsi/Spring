package cn.demo.service.impl;

import cn.demo.dao.IAccountDao;
import cn.demo.entry.Account;
import cn.demo.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname AccountServiceImpl
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/11 13:14
 * @Version V1.0.0
 * @Since 1.0
 */
@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

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
}
