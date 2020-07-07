package cn.demo.conditional;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Classname WindowConditional
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/7 10:27
 * @Version V1.0.0
 * @Since 1.0
 */
public class WindowConditional implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        ConfigurableListableBeanFactory beanFactory = conditionContext.getBeanFactory();
        ClassLoader classLoader = conditionContext.getClassLoader();
        Environment environment = conditionContext.getEnvironment();
        String property = environment.getProperty("os.name");
        System.out.println("当前环境:------>" + property);
        BeanDefinitionRegistry registry = conditionContext.getRegistry();
        String[] beanDefinitionNames = registry.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("------->" + beanDefinitionNames);
        }
        if(property.contains("Windows")){
            return true;
        }
        return false;
    }
}
