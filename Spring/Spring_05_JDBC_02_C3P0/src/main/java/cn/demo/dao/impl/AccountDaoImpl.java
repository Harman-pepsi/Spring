package cn.demo.dao.impl;

import cn.demo.dao.IAccountDao;
import cn.demo.entry.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @Classname AccountDaoImpl
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/10 13:28
 * @Version V1.0.0
 * @Since 1.0
 */
public class AccountDaoImpl implements IAccountDao {

    private QueryRunner runner;

    public void setRunner(QueryRunner runner) {
        this.runner = runner;
    }

    @Override
    public List<Account> findAccountAll() {
        try {
            return runner.query("select acid,acname,balance from account",new BeanListHandler<>(Account.class));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public Account findAccountById(Integer acid) {
        try {
            return runner.query("select acid,acname,balance from account where acid = ?",new BeanHandler<>(Account.class),acid);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public int saveAccount(Account account) {
        try {
            runner.update("update account set acname=?,balance=? where acid=?",account.getAcname(),account.getBalance(),account.getAcid());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return 0;
    }

    @Override
    public int deleteAccountById(Integer acid) {
        try {
            runner.update("delete from account where acid=?",acid);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return 0;
    }

    @Override
    public int updateAccountById(Account account) {
        try {
            runner.update("update account set acname=?,balance=? where acid=?",account.getAcname(),account.getBalance(),account.getAcid());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return 0;
    }
}
