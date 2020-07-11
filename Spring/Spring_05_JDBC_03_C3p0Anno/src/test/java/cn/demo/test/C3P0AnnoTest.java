package cn.demo.test;

import cn.demo.config.SpringConfig;
import cn.demo.entry.Account;
import cn.demo.service.IAccountService;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * @Classname C3P0AnnoTest
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/11 13:47
 * @Version V1.0.0
 * @Since 1.0
 */
public class C3P0AnnoTest {

    @Test
    public void testC3P0(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        IAccountService accountService = context.getBean("accountService", IAccountService.class);
        List<Account> accountAll = accountService.findAccountAll();
        for (Account account : accountAll) {
            System.out.println(account);
        }
    }

    @Test
    public void testQueryRunner(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        QueryRunner queryRunner = context.getBean("queryRunner", QueryRunner.class);
        System.out.println(queryRunner);
    }
}
