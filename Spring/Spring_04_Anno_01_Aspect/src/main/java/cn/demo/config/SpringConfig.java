package cn.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Classname SpringConfig
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/10 10:23
 * @Version V1.0.0
 * @Since 1.0
 */
@Configuration
@ComponentScans(
        @ComponentScan(value = {"cn.demo"})
)
@EnableAspectJAutoProxy
public class SpringConfig {
}
