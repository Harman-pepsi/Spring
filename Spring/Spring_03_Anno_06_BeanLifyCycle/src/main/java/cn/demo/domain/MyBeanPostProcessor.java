package cn.demo.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Classname MyBeanPostProcessor
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/7 21:41
 * @Version V1.0.0
 * @Since 1.0
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization:" + beanName +">>>>>>"+ bean);
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization:" + beanName +">>>>>>"+ bean);
        return null;
    }
}
