package cn.demo.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * @Classname Logging
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/13 11:52
 * @Version V1.0.0
 * @Since 1.0
 */
@Aspect
public class Logging {

    @Pointcut("execution(* cn.demo.utils.MathAlgor.*(..))")
    public void pointCut(){}

    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getName() + "开始......,方法参数:{" + Arrays.asList(joinPoint.getArgs()) + "}");
    }

    @After("pointCut()")
    public void logEnd(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getName() + "除法结束......");
    }

    @AfterReturning(value = "pointCut()",returning = "result")
    //参数JoinPoint在Object之前，否则会报错
    public void logReturn(JoinPoint joinPoint,Object result){
        System.out.println(joinPoint.getSignature().getName() + "除法正常......,结果为:{" + result + "}");
    }

    @AfterThrowing(value = "pointCut()",throwing = "exception")
    public void logThrow(Exception exception){
        System.out.println("除法异常......,异常信息:{" + exception + "}");
    }
}
