package cn.demo.config;

import cn.demo.domain.Color;
import cn.demo.domain.Employer;
import cn.demo.domain.Person;
import cn.demo.domain.User;
import cn.demo.utils.MyImportBeanDefinitionRegistrar;
import cn.demo.utils.MyImportSelector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Classname SpringConfig
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/7 12:41
 * @Version V1.0.0
 * @Since 1.0
 */
@Configuration
@Import(value = {Employer.class, Color.class, Person.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
public class SpringConfig {

    @Bean
    public User user(){
        return new User(1,"Rose","666666");
    }
}
