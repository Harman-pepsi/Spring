package cn.demo.factory;

import cn.demo.service.IAccountService;
import cn.demo.service.impl.AccountServiceImpl;

/**
 * @Classname BeanFactory
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/4 17:13
 * @Version V1.0.0
 * @Since 1.0
 */
public class BeanFactory {

    /*
    public IAccountService getAccountService(){
        return new AccountServiceImpl();
    }
    */

    public static IAccountService getAccountService(){
        return new AccountServiceImpl();
    }
}
