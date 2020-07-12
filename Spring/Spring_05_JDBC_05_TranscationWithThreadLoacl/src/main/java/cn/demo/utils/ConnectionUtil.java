package cn.demo.utils;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Classname ConnectionUtil
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/12 14:37
 * @Version V1.0.0
 * @Since 1.0
 */
public class ConnectionUtil {

    private ThreadLocal<Connection> threadLocal = new ThreadLocal<>();
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Connection getConnection(){
        Connection connection = threadLocal.get();
        try {
            if (connection == null){
                connection = dataSource.getConnection();
                threadLocal.set(connection);
            }
            return connection;
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
    }

    public void releaseConnection(){
        threadLocal.remove();
    }
}
