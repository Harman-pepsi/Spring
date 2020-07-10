package cn.demo.test;

import cn.demo.config.SpringConfig;
import cn.demo.dao.IAccountDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Classname AopAnnoTest
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/10 10:48
 * @Version V1.0.0
 * @Since 1.0
 */
public class AopAnnoTest {

    @Test
    public void testAop(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        IAccountDao accountDao = context.getBean("accountDao", IAccountDao.class);
        accountDao.saveAccount();
    }
}
