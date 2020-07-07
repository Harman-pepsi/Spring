package cn.demo.service.impl;

import cn.demo.dao.IUserDao;
import cn.demo.domain.User;
import cn.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @Classname UserServiceImpl
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/7 22:27
 * @Version V1.0.0
 * @Since 1.0
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public String toString() {
        return "{\"UserServiceImpl\":{"
                + "\"userDao\":" + userDao
                + "}}";
    }
}
