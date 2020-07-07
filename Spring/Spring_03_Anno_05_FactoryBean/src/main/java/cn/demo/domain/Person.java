package cn.demo.domain;

/**
 * @Classname Person
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/7 13:41
 * @Version V1.0.0
 * @Since 1.0
 */
public class Person {

    private Integer id;
    private String username;
    private String password;

    public Person(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "{\"Person\":{"
                + "\"id\":\"" + id + "\""
                + ", \"username\":\"" + username + "\""
                + ", \"password\":\"" + password + "\""
                + "}}";
    }
}
