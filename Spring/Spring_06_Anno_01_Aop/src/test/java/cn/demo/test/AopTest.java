package cn.demo.test;

import cn.demo.config.SpringConfig;
import cn.demo.utils.MathAlgor;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Classname AopTest
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/13 12:19
 * @Version V1.0.0
 * @Since 1.0
 */
public class AopTest {

    @Test
    public void testAspect(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        MathAlgor mathAlgor = context.getBean("mathAlgor", MathAlgor.class);
        mathAlgor.div(1,0);
    }
}
