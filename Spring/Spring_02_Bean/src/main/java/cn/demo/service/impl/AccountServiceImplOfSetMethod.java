package cn.demo.service.impl;

import cn.demo.service.IAccountService;

import java.util.Date;

/**
 * @Classname AccountServiceImplOfSetMethod
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/5 12:07
 * @Version V1.0.0
 * @Since 1.0
 */
public class AccountServiceImplOfSetMethod implements IAccountService {

    private Integer id;
    private String username;
    private String password;
    private Date birthday;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public void saveAccount() {
        System.out.println("AccountServiceImplOfSetMethod saveAccount successfully.......");
        System.out.println(id + "------" + username + "------" + password + "-------" + birthday);
    }
}
