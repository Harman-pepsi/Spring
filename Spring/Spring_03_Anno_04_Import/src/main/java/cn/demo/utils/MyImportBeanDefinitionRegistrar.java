package cn.demo.utils;

import cn.demo.domain.Animal;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Classname MyImportBeanDefinitionRegistrar
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/7 13:07
 * @Version V1.0.0
 * @Since 1.0
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean user = registry.containsBeanDefinition("user");
        boolean teacher = registry.containsBeanDefinition("cn.demo.domain.Teacher");
        if(user && teacher){
            RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Animal.class);
            registry.registerBeanDefinition("animal",rootBeanDefinition);
        }

    }
}
