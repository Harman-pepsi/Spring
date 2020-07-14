package cn.demo.config;

import cn.demo.utils.Logging;
import cn.demo.utils.MathAlgor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Classname SpringConfig
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/13 12:04
 * @Version V1.0.0
 * @Since 1.0
 */
@Configuration
@EnableAspectJAutoProxy
public class SpringConfig {

    @Bean
    public MathAlgor mathAlgor(){
        return new MathAlgor();
    }

    @Bean
    public Logging logging(){
        return new Logging();
    }
}
