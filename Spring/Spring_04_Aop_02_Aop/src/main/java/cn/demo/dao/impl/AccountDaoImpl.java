package cn.demo.dao.impl;

import cn.demo.dao.IAccountDao;

/**
 * @Classname AccountDaoImpl
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/8 13:32
 * @Version V1.0.0
 * @Since 1.0
 */
public class AccountDaoImpl implements IAccountDao {
    @Override
    public void saveAccount() {
        System.out.println("开户成功......");
    }

    @Override
    public void updateAccount(Integer i) {
        System.out.println("更新账户"+ i +"成功......");
    }

    @Override
    public int deleteAccount() {
        System.out.println("销户成功......");
        return 0;
    }
}
