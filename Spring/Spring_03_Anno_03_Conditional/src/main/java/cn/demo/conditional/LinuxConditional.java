package cn.demo.conditional;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Classname LinuxConditional
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/7 10:04
 * @Version V1.0.0
 * @Since 1.0
 */
public class LinuxConditional implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Environment environment = conditionContext.getEnvironment();
        String property = environment.getProperty("os.name");
        System.out.println("当前环境:------>" + property);
        if(property.contains("Linux")){
            return true;
        }
        return false;
    }
}
