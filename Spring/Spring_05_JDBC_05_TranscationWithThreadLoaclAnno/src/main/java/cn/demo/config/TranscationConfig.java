package cn.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

/**
 * @Classname TranscationConfig
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/13 3:27
 * @Version V1.0.0
 * @Since 1.0
 */
public class TranscationConfig {

    @Bean(name = "transactionManager")
    public PlatformTransactionManager platformTransactionManager(DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }
}
