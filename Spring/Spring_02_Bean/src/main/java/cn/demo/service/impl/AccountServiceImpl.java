package cn.demo.service.impl;

import cn.demo.service.IAccountService;

import java.util.Date;

/**
 * @Classname AccountServiceImpl
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/4 16:58
 * @Version V1.0.0
 * @Since 1.0
 */
public class AccountServiceImpl implements IAccountService {

    private Integer id;
    private String username;
    private String password;

    public AccountServiceImpl() {
        System.out.println("AccountServiceImpl无参构造函数......");
    }

    public AccountServiceImpl(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    @Override
    public void saveAccount() {
        System.out.println("AccountServiceImpl saveAccount Successfully......");
        System.out.println(id + "------" + username + "-------" + password );
    }

    public void init(){
        System.out.println("AccountServiceImpl init......");
    }

    public void destory(){
        System.out.println("AccountServiceImpl destory......");
    }
}
