package cn.demo.dao.impl;

import cn.demo.dao.IUserDao;
import cn.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * @Classname UserDaoImpl
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/7 22:24
 * @Version V1.0.0
 * @Since 1.0
 */
@Repository
public class UserDaoImpl implements IUserDao {

    private String label = "1";

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "{\"UserDaoImpl\":{"
                + "\"label\":\"" + label + "\""
                + "}}";
    }
}
