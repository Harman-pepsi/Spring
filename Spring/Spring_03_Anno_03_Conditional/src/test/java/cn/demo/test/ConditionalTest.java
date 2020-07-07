package cn.demo.test;

import cn.demo.config.SpringConfig;
import cn.demo.domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

/**
 * @Classname ConditionalTest
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/7 10:43
 * @Version V1.0.0
 * @Since 1.0
 */
public class ConditionalTest {

    @Test
    public void testConditional(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        String[] beanNamesForType = context.getBeanNamesForType(User.class);

        Environment environment = context.getEnvironment();
        String property = environment.getProperty("os.name");
        System.out.println("当前环境:" + property);

        for (String s : beanNamesForType) {
            System.out.println(">>>>" + s);
        }

    }
}
