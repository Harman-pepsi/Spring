package cn.demo.service.impl;

import cn.demo.dao.IUserDao;
import cn.demo.service.IUserService;

/**
 * @Classname UserServiceImpl
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/4 16:03
 * @Version V1.0.0
 * @Since 1.0
 */
public class UserServiceImpl implements IUserService {

    private IUserDao userDao ;

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser() {
        userDao.saveUser();
    }
}
