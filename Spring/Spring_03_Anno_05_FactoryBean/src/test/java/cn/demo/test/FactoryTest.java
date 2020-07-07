package cn.demo.test;

import cn.demo.config.SpringConfig;
import cn.demo.factory.PersonFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Classname FactoryTest
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/7 13:51
 * @Version V1.0.0
 * @Since 1.0
 */
public class FactoryTest {

    private ApplicationContext context;

    @Test
    public void testFactory(){
        context = new AnnotationConfigApplicationContext(SpringConfig.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(">>>>>>" + beanDefinitionName);
        }

        Object personFactory1 = context.getBean("personFactory");
        Object personFactory2 = context.getBean("personFactory");
        System.out.println(personFactory1.toString());
        System.out.println(personFactory1.getClass());
        System.out.println(personFactory2.getClass());
        System.out.println(personFactory1 == personFactory2);

        //加上‘&’表示获取FactoryBean本身，即案例中的PersonFactoryBean
        Object bean = context.getBean("&personFactory");
        System.out.println(bean.getClass());
    }
}
