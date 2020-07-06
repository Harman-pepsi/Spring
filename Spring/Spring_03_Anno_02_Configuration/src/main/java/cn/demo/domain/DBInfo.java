package cn.demo.domain;

import org.springframework.beans.factory.annotation.Value;

/**
 * @Classname DBInfo
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/7 4:05
 * @Version V1.0.0
 * @Since 1.0
 */
public class DBInfo {
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String usename;
    @Value("${jdbc.password}")
    private String password;

    @Override
    public String toString() {
        return "{\"DBInfo\":{"
                + "\"driver\":\"" + driver + "\""
                + ", \"url\":\"" + url + "\""
                + ", \"usename\":\"" + usename + "\""
                + ", \"password\":\"" + password + "\""
                + "}}";
    }
}
