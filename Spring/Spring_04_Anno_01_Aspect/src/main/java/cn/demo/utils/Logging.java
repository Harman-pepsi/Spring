package cn.demo.utils;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Classname Logging
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/10 10:29
 * @Version V1.0.0
 * @Since 1.0
 */
@Component
@Aspect //表示该类是一个切面类
public class Logging {

    @Pointcut("execution(* *..*.saveAccount(..))")
    public void pointCut(){}

    @Before("pointCut()")
    public void beforeLogging(){
        System.out.println("前置通知.....输出日志");
    }

    @AfterReturning("pointCut()")
    public void afterReturnLogging(){
        System.out.println("后置通知......输出日志");
    }

    @AfterThrowing("pointCut()")
    public void afterThrowLogging(){
        System.out.println("异常通知......输出日志");
    }

    @After("pointCut()")
    public void afterLogging(){
        System.out.println("最终通知......输出日志");
    }
}
