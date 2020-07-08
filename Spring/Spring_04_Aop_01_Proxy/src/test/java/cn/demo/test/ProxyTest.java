package cn.demo.test;

import _01_静态代理.cn.demo.dao.ITeacherDao;
import _01_静态代理.cn.demo.dao.impl.TeacherDaoImpl;
import _01_静态代理.cn.demo.proxy.TeacherProxy;

import org.junit.Test;

/**
 * @Classname ProxyTest
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/8 12:11
 * @Version V1.0.0
 * @Since 1.0
 */
public class ProxyTest {

    @Test
    public void testStaticProxy(){
        ITeacherDao teacherDao= new TeacherProxy(new TeacherDaoImpl());
        teacherDao.teacher();
    }

    @Test
    public void testJDKProxy(){
        ITeacherDao teacherDao = new TeacherDaoImpl();
        ITeacherDao objectInstance = (ITeacherDao) new _02_动态代理之JDK.cn.demo.proxy.TeacherProxy(teacherDao).getObjectInstance();
        objectInstance.teacher();
    }

    @Test
    public void testCGLIBProxy(){
        _03_动态代理之CGLIB.cn.demo.dao.impl.TeacherDaoImpl teacherDao = new _03_动态代理之CGLIB.cn.demo.dao.impl.TeacherDaoImpl();
        _03_动态代理之CGLIB.cn.demo.dao.impl.TeacherDaoImpl proxyInstance = (_03_动态代理之CGLIB.cn.demo.dao.impl.TeacherDaoImpl) new _03_动态代理之CGLIB.cn.demo.proxy.TeacherProxy(teacherDao).getProxyInstance();
        proxyInstance.teach();
    }
}
