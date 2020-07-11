package cn.demo.config;

import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.*;

/**
 * @Classname SpringConfig
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/11 13:21
 * @Version V1.0.0
 * @Since 1.0
 */
@Configuration
@ComponentScans(
        @ComponentScan(value = {"cn.demo"})
)
@PropertySources(
        @PropertySource(value = {"classpath:db.properties"})
)
@Import(value = {JDBCConfig.class})
public class SpringConfig {
}
