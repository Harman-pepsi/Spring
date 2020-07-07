package cn.demo.config;

import cn.demo.factory.PersonFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname SpringConfig
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/7 13:48
 * @Version V1.0.0
 * @Since 1.0
 */
@Configuration
public class SpringConfig {

    @Bean
    public PersonFactory personFactory(){
        return new PersonFactory();
    }
}
