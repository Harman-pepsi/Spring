package _01_静态代理.cn.demo.dao.impl;

import _01_静态代理.cn.demo.dao.ITeacherDao;

/**
 * @Classname TeacherDaoImpl
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/8 12:06
 * @Version V1.0.0
 * @Since 1.0
 */
public class TeacherDaoImpl implements ITeacherDao {
    @Override
    public void teacher() {
        System.out.println("老师开始授课.......");
    }
}
