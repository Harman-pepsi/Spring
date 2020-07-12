package cn.demo.dao.impl;

import cn.demo.dao.IAccountDao;
import cn.demo.entry.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * @Classname AccountDaoImpl
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/12 14:27
 * @Version V1.0.0
 * @Since 1.0
 */
@Repository("accountDao")
public class AccountDaoImpl implements IAccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Account> findAccountAll() {
        return jdbcTemplate.query("select * from account",new BeanPropertyRowMapper<Account>(Account.class));
    }

    @Override
    public Account findAccountById(Integer acid) {
        List<Account> accountList = jdbcTemplate.query("select * from account where acid = ?",new BeanPropertyRowMapper<Account>(Account.class),acid);
        return accountList.isEmpty() ? null : accountList.get(0);
    }

    @Override
    public int saveAccount(Account account) {
        return jdbcTemplate.update("insert into account(acname, balance) values (?,?)",account.getAcname(),account.getBalance());
    }

    @Override
    public int deleteAccountById(Integer acid) {
        return jdbcTemplate.update("delete from account where acid = ?",acid);
    }

    @Override
    public int updateAccount(Account account) {
        return jdbcTemplate.update("update account set acname = ?,balance=? where acid = ?",account.getAcname(),account.getBalance(),account.getAcid());
    }
}
