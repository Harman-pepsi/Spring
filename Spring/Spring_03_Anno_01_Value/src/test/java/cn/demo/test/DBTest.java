package cn.demo.test;

import cn.demo.domain.DBInfo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Classname DBTest
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/6 10:49
 * @Version V1.0.0
 * @Since 1.0
 */
public class DBTest {

    @Test
    public void testDB(){
        ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
        DBInfo dbInfo = context.getBean("DBInfo", DBInfo.class);
        System.out.println(dbInfo.toString());
    }
}
