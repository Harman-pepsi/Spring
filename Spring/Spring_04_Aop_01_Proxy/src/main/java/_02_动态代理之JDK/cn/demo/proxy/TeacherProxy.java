package _02_动态代理之JDK.cn.demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Classname TeacherProxy
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/8 12:41
 * @Version V1.0.0
 * @Since 1.0
 */
public class TeacherProxy {

    private Object target;

    public TeacherProxy(Object target) {
        this.target = target;
    }

    public Object getObjectInstance(){
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDK代理开始.......");
                        Object invoke = method.invoke(target, args);
                        System.out.println("JDK代理提交.......");
                        return invoke;
                    }
                }
        );
    }
}
