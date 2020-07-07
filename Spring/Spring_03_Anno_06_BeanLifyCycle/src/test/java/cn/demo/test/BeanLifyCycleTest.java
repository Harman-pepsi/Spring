package cn.demo.test;

import cn.demo.config.SpringConfig;
import cn.demo.domain.Animal;
import cn.demo.domain.Car;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Classname BeanLifyCycleTest
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/7 18:24
 * @Version V1.0.0
 * @Since 1.0
 */
public class BeanLifyCycleTest {

    @Test
    public void testBeanLifeCycle(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Car car = context.getBean("car", Car.class);
        System.out.println(car);
        context.close();
    }

    @Test
    public void testAnimal(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        System.out.println("容器创建完成");
        context.close();
    }
}
