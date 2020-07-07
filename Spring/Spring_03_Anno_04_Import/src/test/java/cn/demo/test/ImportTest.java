package cn.demo.test;

import cn.demo.config.SpringConfig;
import cn.demo.domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Classname ImportTest
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/7 12:46
 * @Version V1.0.0
 * @Since 1.0
 */
public class ImportTest {

    @Test
    public void testImport(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(">>>>>>" + beanDefinitionName);
        }

        User user = context.getBean("user", User.class);
        System.out.println(user);
    }
}
