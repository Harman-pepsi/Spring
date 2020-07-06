package cn.demo.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

/**
 * @Classname DBInfo
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/6 10:46
 * @Version V1.0.0
 * @Since 1.0
 */
@Component
@PropertySources(
        @PropertySource(value = {"db.properties"})
)
public class DBInfo {

    @Value("#{50-3}")
    private Integer id;
    @Value("root")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    @Override
    public String toString() {
        return "{\"DBInfo\":{"
                + "\"id\":\"" + id + "\""
                + ", \"username\":\"" + username + "\""
                + ", \"password\":\"" + password + "\""
                + "}}";
    }
}
