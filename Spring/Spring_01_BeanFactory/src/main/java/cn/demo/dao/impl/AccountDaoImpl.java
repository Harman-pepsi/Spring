package cn.demo.dao.impl;

import cn.demo.dao.IAccountDao;

/**
 * @Classname AccountDaoImpl
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/6 10:04
 * @Version V1.0.0
 * @Since 1.0
 */
public class AccountDaoImpl implements IAccountDao {
    @Override
    public void saveAccount() {
        System.out.println("AccountDaoImpl saveAccount Successfully.......");
    }
}
