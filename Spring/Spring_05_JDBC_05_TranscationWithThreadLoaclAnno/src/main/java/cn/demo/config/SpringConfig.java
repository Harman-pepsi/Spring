package cn.demo.config;

import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Classname SpringConfig
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/13 3:07
 * @Version V1.0.0
 * @Since 1.0
 */
@Configuration
@ComponentScans(
        @ComponentScan(basePackages = {"cn.demo"})
)
@PropertySource(value = {"db.properties"})
@Import(value = {JDBCConfig.class,TranscationConfig.class})
@EnableTransactionManagement
public class SpringConfig {
}
