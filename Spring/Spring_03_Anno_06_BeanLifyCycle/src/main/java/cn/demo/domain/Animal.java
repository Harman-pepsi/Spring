package cn.demo.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @Classname Animal
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/7 19:36
 * @Version V1.0.0
 * @Since 1.0
 */
//@Component
public class Animal implements InitializingBean, DisposableBean {

    public Animal() {
        System.out.println("Animal Constractor.......");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Animal desotry......");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Animal afterPropertiesSet......");
    }
}
