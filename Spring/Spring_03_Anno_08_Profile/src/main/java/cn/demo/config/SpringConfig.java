package cn.demo.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.*;
import org.springframework.util.StringValueResolver;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * @Classname SpringConfig
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/8 0:54
 * @Version V1.0.0
 * @Since 1.0
 */
@Configuration
@PropertySources(
        @PropertySource(value = {"classpath:jdbc.properties"})
)
public class SpringConfig implements EmbeddedValueResolverAware {

    @Value("${jdbc.driver}")
    private String driver;

    private StringValueResolver valueResolver;
    private String url;

    @Profile("dev")
    @Bean("devDataSource")
    public DataSource dataSourceDev(@Value("${jdbc.password}") String password) throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(driver);
        dataSource.setJdbcUrl(url);
        dataSource.setUser("root");
        dataSource.setPassword(password);
        return dataSource;
    }

    @Profile("test")
    @Bean("testDataSource")
    public DataSource dataSourceTest(@Value("${jdbc.password}") String password) throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(driver);
        dataSource.setJdbcUrl(url);
        dataSource.setUser("root");
        dataSource.setPassword(password);
        return dataSource;
    }

    @Profile("prod")
    @Bean("prodDataSource")
    public DataSource dataSourceProd(@Value("${jdbc.password}") String password) throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(driver);
        dataSource.setJdbcUrl(url);
        dataSource.setUser("root");
        dataSource.setPassword(password);
        return dataSource;
    }

    @Override
    public void setEmbeddedValueResolver(StringValueResolver stringValueResolver) {
        this.valueResolver = stringValueResolver;
        url = valueResolver.resolveStringValue("${jdbc.url}");
    }
}
