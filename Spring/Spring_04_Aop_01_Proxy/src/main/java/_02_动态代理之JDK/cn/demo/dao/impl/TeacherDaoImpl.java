package _02_动态代理之JDK.cn.demo.dao.impl;

import _02_动态代理之JDK.cn.demo.dao.ITeacherDao;

/**
 * @Classname TeacherDaoImpl
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/8 12:41
 * @Version V1.0.0
 * @Since 1.0
 */
public class TeacherDaoImpl implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("开始授课......");
    }
}
