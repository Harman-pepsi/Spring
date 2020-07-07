package cn.demo.test;

import cn.demo.config.SpringConfig;
import cn.demo.domain.AwareBean;
import cn.demo.domain.Car;
import cn.demo.domain.Color;
import cn.demo.domain.User;
import cn.demo.service.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Classname AutoWiredTest
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/7 22:28
 * @Version V1.0.0
 * @Since 1.0
 */
public class AutoWiredTest {

    @Test
    public void testAutoWired(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(">>>>>>" + beanDefinitionName);
        }

        IUserService userService = context.getBean(IUserService.class);
        System.out.println(userService);
    }

    @Test
    public void testBean(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//        String[] beanDefinitionNames = context.getBeanDefinitionNames();
//        for (String beanDefinitionName : beanDefinitionNames) {
//            System.out.println(">>>>>>" + beanDefinitionName);
//        }
        Car car = context.getBean(Car.class);
        System.out.println(car);
        //Color color = context.getBean(Color.class);
        //System.out.println(color);
    }

    @Test
    public void testAwareBean(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        System.out.println(context);
        AwareBean bean = context.getBean(AwareBean.class);
        System.out.println(bean);
    }
}
