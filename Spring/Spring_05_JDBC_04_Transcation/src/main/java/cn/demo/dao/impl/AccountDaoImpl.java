package cn.demo.dao.impl;

import cn.demo.dao.IAccountDao;
import cn.demo.entry.Account;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

/**
 * @Classname AccountDaoImpl
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/10 12:04
 * @Version V1.0.0
 * @Since 1.0
 */
public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao {
    @Override
    public List<Account> findAccountAll() {
        return super.getJdbcTemplate().query("select acid,acname,balance from account",new BeanPropertyRowMapper<>(Account.class));
    }

    @Override
    public Account findAccountById(Integer acid) {
        List<Account> accountList = super.getJdbcTemplate().query("select acid,acname,balance from account where acid = ?", new BeanPropertyRowMapper<>(Account.class), acid);
        return accountList.isEmpty() ? null : accountList.get(0);
    }

    @Override
    public int saveAccount(Account account) {
        return 0;
    }

    @Override
    public int deleteAccountById(Integer acid) {
        return 0;
    }

    @Override
    public int updateAccount(Account account) {
        return super.getJdbcTemplate().update("update account set acname = ?,balance = ? where acid=?",account.getAcname(),account.getBalance(),account.getAcid());
    }
}
