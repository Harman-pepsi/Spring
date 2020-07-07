package cn.demo.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Classname User
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/7 21:54
 * @Version V1.0.0
 * @Since 1.0
 */
//@Component
public class User {

    public User() {
        System.out.println("User Constructor.......");
    }

    @PostConstruct
    public void init(){
        System.out.println("User @PostConstruct......");
    }

    @PreDestroy
    public void destory(){
        System.out.println("User @PreDestroy.......");
    }
}
