package cn.demo.utils;

import org.aspectj.lang.ProceedingJoinPoint;

import java.sql.SQLException;

/**
 * @Classname TranscationManager
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/12 14:43
 * @Version V1.0.0
 * @Since 1.0
 */
public class TranscationManager {

    private ConnectionUtil connectionUtil;

    public void setConnectionUtil(ConnectionUtil connectionUtil) {
        this.connectionUtil = connectionUtil;
    }

    public void beginTranscation(){
        try {
            connectionUtil.getConnection().setAutoCommit(false);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void commitTranscation(){
        try {
            connectionUtil.getConnection().commit();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void rollbackTranscation(){
        try {
            connectionUtil.getConnection().rollback();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void closeTranscation(){
        try {
            connectionUtil.getConnection().close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    //配置环绕通知
    public Object proxyAccountService(ProceedingJoinPoint proceedingJoinPoint){
        Object returnValue = null;
        try {
            beginTranscation();
            Object[] args = proceedingJoinPoint.getArgs();
            returnValue = proceedingJoinPoint.proceed(args);
            commitTranscation();
            return returnValue;
        } catch (Throwable throwable) {
            rollbackTranscation();
            System.out.println("转账失败!");
            throw new RuntimeException(throwable);
        }finally {
            closeTranscation();
            connectionUtil.releaseConnection();
        }
    }
}
