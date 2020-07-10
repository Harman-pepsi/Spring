package cn.demo.dao.impl;

import cn.demo.dao.IAccountDao;
import org.springframework.stereotype.Repository;

/**
 * @Classname AccountDaoImpl
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/10 10:27
 * @Version V1.0.0
 * @Since 1.0
 */
@Repository("accountDao")
public class AccountDaoImpl implements IAccountDao {
    @Override
    public void saveAccount() {
        System.out.println("开户成功......");
    }

    @Override
    public int deleteAccount() {
        System.out.println("销户成功......");
        return 0;
    }
}
