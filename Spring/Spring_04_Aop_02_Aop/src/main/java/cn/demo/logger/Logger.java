package cn.demo.logger;

/**
 * @Classname Logger
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/8 13:36
 * @Version V1.0.0
 * @Since 1.0
 */
public class Logger {

    /**
     * 用于打印日志，计划让其在切入点方法执行前执行(切入点方法就是执行方法)
     */
    public void printLog(){
        System.out.println("开始打印日志......");
    }
}
