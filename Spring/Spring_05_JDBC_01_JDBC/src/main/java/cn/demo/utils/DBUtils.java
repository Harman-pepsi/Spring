package cn.demo.utils;


import java.sql.*;
import java.util.ResourceBundle;

/**
 * @Classname DBUtils
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/10 14:11
 * @Version V1.0.0
 * @Since 1.0
 */
public class DBUtils {

    private DBUtils(){}

    private static String driver;
    private static String url;
    private static String username;
    private static String password;

    static {
        try {
            ResourceBundle bundle = ResourceBundle.getBundle("db");
            driver = bundle.getString("jdbc.driver");
            url = bundle.getString("jdbc.url");
            username = bundle.getString("jdbc.username");
            password = bundle.getString("jdbc.password");
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,username,password);
    }

    public static void close(Connection conn,PreparedStatement ps,ResultSet rs){
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }finally {
                if(ps != null){
                    try {
                        ps.close();
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }finally {
                        if(conn != null){
                            try {
                                conn.close();
                            } catch (SQLException throwables) {
                                throwables.printStackTrace();
                            }
                        }
                    }
                }
            }
        }
    }
}
