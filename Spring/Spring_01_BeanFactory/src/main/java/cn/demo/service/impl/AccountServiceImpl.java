package cn.demo.service.impl;

import cn.demo.dao.IAccountDao;
import cn.demo.factory.BeanFactory;
import cn.demo.service.IAccountService;

/**
 * @Classname AccountServiceImpl
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/6 10:05
 * @Version V1.0.0
 * @Since 1.0
 */
public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao = (IAccountDao) BeanFactory.getBeanOfProperty("accountDao");
    private int i = 0;

    @Override
    public void saveAccount() {
        accountDao.saveAccount();
        System.out.println(i++);
    }
}
