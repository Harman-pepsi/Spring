package cn.demo.test;

import cn.demo.config.SpringConfig;
import cn.demo.domain.DBInfo;
import cn.demo.domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Classname ConfigTest
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/6 11:13
 * @Version V1.0.0
 * @Since 1.0
 */
public class ConfigTest {

    @Test
    public void testConfig(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

        User user = context.getBean("user", User.class);
        System.out.println(user);

        DBInfo dbInfo1 = context.getBean("dbInfo", DBInfo.class);
        DBInfo dbInfo2 = context.getBean("dbInfo", DBInfo.class);
        System.out.println(dbInfo1 == dbInfo2);
    }
}
