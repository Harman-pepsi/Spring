package _01_静态代理.cn.demo.proxy;

import _01_静态代理.cn.demo.dao.ITeacherDao;

/**
 * @Classname TeacherProxy
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/8 12:08
 * @Version V1.0.0
 * @Since 1.0
 */
public class TeacherProxy implements ITeacherDao {

    private ITeacherDao target;

    public TeacherProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teacher() {
        System.out.println("开始代理......");
        target.teacher();
        System.out.println("代理提交......");
    }
}
