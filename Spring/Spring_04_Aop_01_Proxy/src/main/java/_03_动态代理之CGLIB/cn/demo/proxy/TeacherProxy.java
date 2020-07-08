package _03_动态代理之CGLIB.cn.demo.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Classname TeacherProxy
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/8 13:03
 * @Version V1.0.0
 * @Since 1.0
 */
public class TeacherProxy implements MethodInterceptor {

    private Object target;

    public TeacherProxy(Object target) {
        this.target = target;
    }

    public Object getProxyInstance(){
        //设置工具类
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建子类对象，即代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始代理........");
        Object invoke = method.invoke(target, args);
        System.out.println("代理提交.......");
        return invoke;
    }
}
