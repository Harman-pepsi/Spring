package cn.demo.test;

import cn.demo.dao.IAccountDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Classname AdviceTypeTest
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/8 15:59
 * @Version V1.0.0
 * @Since 1.0
 */
public class AdviceTypeTest {

    @Test
    public void testAdviceType(){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
        IAccountDao accountDao = context.getBean("accountDao", IAccountDao.class);
        accountDao.saveAccount();
    }
}
