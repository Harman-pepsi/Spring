package cn.demo.service.impl;

import cn.demo.service.IAccountService;

import java.util.*;

/**
 * @Classname AccountServiceImplOfOtherType
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/5 12:18
 * @Version V1.0.0
 * @Since 1.0
 */
public class AccountServiceImplOfOtherType implements IAccountService {

    private String[] str_Array;
    private List<String> list;
    private Set<String> set;
    private Map<String,String> map;
    private Properties properties;

    public void setStr_Array(String[] str_Array) {
        this.str_Array = str_Array;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public void saveAccount() {
        System.out.println("AccountServiceImplOfOtherType saveAccount .......");
        System.out.println(Arrays.toString(str_Array));
        System.out.println(list);
        System.out.println(set);
        System.out.println(map);
        System.out.println(properties);
    }
}
