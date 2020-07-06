package cn.demo.test;

import cn.demo.service.IAccountService;
import cn.demo.service.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Classname UserTest
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/4 16:11
 * @Version V1.0.0
 * @Since 1.0
 */
public class UserTest {

    @Test
    public void testUser(){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
        IUserService userServiceImpl = context.getBean("userService", IUserService.class);
        userServiceImpl.saveUser();
    }

    @Test
    public void testAccount(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService accountService = context.getBean("accountService", IAccountService.class);
        accountService.saveAccount();
    }

    @Test
    public void testLifecycle(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService accountService = context.getBean("accountService", IAccountService.class);
        accountService.saveAccount();
        context.close();
    }

    @Test
    public void testShowUser(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService accountService = context.getBean("accountService", IAccountService.class);
        accountService.saveAccount();
        context.close();
    }
}
