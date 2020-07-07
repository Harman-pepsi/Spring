package cn.demo.domain;

/**
 * @Classname User
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/7 4:50
 * @Version V1.0.0
 * @Since 1.0
 */
public class User {
    private String id;
    private String username;
    private String password;

    public User(String id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "{\"User\":{"
                + "\"id\":\"" + id + "\""
                + ", \"username\":\"" + username + "\""
                + ", \"password\":\"" + password + "\""
                + "}}";
    }
}
