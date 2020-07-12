package cn.demo.dao.impl;

import cn.demo.dao.IAccountDao;
import cn.demo.entry.Account;
import cn.demo.utils.ConnectionUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @Classname AccountDaoImpl
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/12 14:27
 * @Version V1.0.0
 * @Since 1.0
 */
public class AccountDaoImpl implements IAccountDao {

    private QueryRunner queryRunner;
    private ConnectionUtil connectionUtil;

    public void setQueryRunner(QueryRunner queryRunner) {
        this.queryRunner = queryRunner;
    }

    public void setConnectionUtil(ConnectionUtil connectionUtil) {
        this.connectionUtil = connectionUtil;
    }

    @Override
    public List<Account> findAccountAll() {
        try {
            return queryRunner.query(connectionUtil.getConnection(),"select acid,acname,balance from account",new BeanListHandler<>(Account.class));
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
    }

    @Override
    public Account findAccountById(Integer acid) {
        try {
            return queryRunner.query(connectionUtil.getConnection(),"select acid,acname,balance from account where acid=?",new BeanHandler<>(Account.class),acid);
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
    }

    @Override
    public int saveAccount(Account account) {
        try {
            return queryRunner.update(connectionUtil.getConnection(),"insert into account(acid,acname,balance) values(?,?,?)",account.getAcid(),account.getAcname(),account.getBalance());
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public int deleteAccountById(Integer acid) {
        try {
            return queryRunner.update(connectionUtil.getConnection(),"delete from account where acid = ?",acid);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public int updateAccount(Account account) {
        try {
            return queryRunner.update(connectionUtil.getConnection(),"update account set acname = ?,balance = ? where acid = ?",account.getAcname(),account.getBalance(),account.getAcid());
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
