package cn.demo.dao.impl;

import cn.demo.dao.IAccountDao;
import cn.demo.entry.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 * @Classname AccountDaoImpl
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/11 13:09
 * @Version V1.0.0
 * @Since 1.0
 */
@Repository("accountDao")
public class AccountDaoImpl implements IAccountDao {

    @Autowired
    private QueryRunner queryRunner;

    @Override
    public List<Account> findAccountAll() {
        try {
            return queryRunner.query("select acid,acname,balance from account",new BeanListHandler<Account>(Account.class));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public Account findAccountById(Integer acid) {
        return null;
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
        return 0;
    }
}
