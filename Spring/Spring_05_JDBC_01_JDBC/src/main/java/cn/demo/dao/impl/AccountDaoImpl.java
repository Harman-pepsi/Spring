package cn.demo.dao.impl;

import cn.demo.dao.IAccountDao;
import cn.demo.entry.Account;
import cn.demo.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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

    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    @Override
    public List<Account> findAccountAll() {
        try {
            conn = DBUtils.getConnection();
            String sql = "select acid,acname,balance from account";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            List<Account> list = new ArrayList<>();
            while (rs.next()){
                list.add(new Account(rs.getInt("acid"),rs.getString("acname"),rs.getDouble("balance")));
            }
            return list;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBUtils.close(conn,ps,rs);
        }
        return null;
    }

    @Override
    public Account findAccountById(Integer acid) {
        Account account = null;
        try {
            conn = DBUtils.getConnection();
            String sql = "select acid,acname,balance from account where acid = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1,1);
            rs = ps.executeQuery();
            while (rs.next()) {
                account = new Account(rs.getInt("acid"), rs.getString("acname"), rs.getDouble("balance"));
            }
            return account;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
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
    public int updateAccountById(Account account) {
        return 0;
    }
}
