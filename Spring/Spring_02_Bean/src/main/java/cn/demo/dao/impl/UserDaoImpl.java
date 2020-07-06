package cn.demo.dao.impl;

import cn.demo.bean.User;
import cn.demo.dao.IUserDao;

/**
 * @Classname UserDaoImpl
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/4 15:48
 * @Version V1.0.0
 * @Since 1.0
 */
public class UserDaoImpl implements IUserDao {

    @Override
    public void saveUser() {
        System.out.println("UserDaoImpl saveUser Successfully......");
    }
}
