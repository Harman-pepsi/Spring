package cn.demo.test;

import cn.demo.config.SpringConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

/**
 * @Classname ProfileTest
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/8 1:06
 * @Version V1.0.0
 * @Since 1.0
 */
public class ProfileTest {

    @Test
    public void testDataSource(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        String[] beanNamesForType = context.getBeanNamesForType(DataSource.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }
    }

    @Test
    public void testProfile(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("test","dev");
        context.register(SpringConfig.class);
        context.refresh();
        String[] beanNamesForType = context.getBeanNamesForType(DataSource.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }
    }
}
