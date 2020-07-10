package cn.demo.utils;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @Classname Logger
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/8 15:45
 * @Version V1.0.0
 * @Since 1.0
 */
public class Logger {

    /**
     * 前置通知
     */
    public void beforePrintLog(){
        System.out.println("前置通知:Logger类中beforePrintLog方法开始记录日志>>>>>>>>>>>>");
    }

    /**
     * 后置通知
     */
    public void afterReturningPrintLog(){
        System.out.println("后置通知:Logger类中afterReturningPrintLog方法开始记录日志>>>>>>>>>>>>");
    }

    /**
     * 异常通知
     */
    public void afterThrowPrintLog(){
        System.out.println("异常通知:Logger类中afterThrowPrintLog方法开始记录日志>>>>>>>>>>>>");
    }

    /**
     * 最终通知
     */
    public void afterPrintLog(){
        System.out.println("最终通知:Logger类中afterPrintLog方法开始记录日志>>>>>>>>>>>>");
    }

    /**
     * 环绕通知
     *  问题:
     *      我们配置了环绕通知之后，切入点方法没有执行，而通知方法执行了
     *  分析:
     *      通过对比动态代理中的环绕通知代码，发现动态代理的环绕通知有明确的切入点方法调用，而我们的代码中没有。
     *  解决:
     *      Spring框架为我们提供一个接口：ProceedingJoinPoint。该接口有一个方法proceed(),此方法就相当于，明确调用切入点方法。
     *      该接口可以作为环绕通知的方法参数，在程序执行时，spring框架会为我们提供该接口的实现类供我们使用。
     *  spring中环绕通知:
     *      它是spring框架为我们提供的一种可以在代码中手动控制增强方法何时执行的方式
     */
    public Object aroundPrintLog(ProceedingJoinPoint proceedingJoinPoint){
        Object returnValue = null;
        try {
            System.out.println("环绕通知:Logger类中aroundPrintLog方法开始记录日志了......前置");
            Object[] args = proceedingJoinPoint.getArgs(); // 得到方法执行所需的参数
            returnValue = proceedingJoinPoint.proceed(); //明确调用业务层方法(切入点方法)
            System.out.println("环绕通知:Logger类中aroundPrintLog方法开始记录日志了......后置");
            return returnValue;
        } catch (Throwable throwable) {
            System.out.println("环绕通知:Logger类中aroundPrintLog方法开始记录日志了......异常");
            throw new RuntimeException(throwable);
        }finally {
            System.out.println("环绕通知:Logger类中aroundPrintLog方法开始记录日志了......最终");
        }
    }

}
