package cn.demo.dao;

/**
 * 模拟账户操作
 */
public interface IAccountDao {
    void saveAccount();
    void updateAccount(Integer i);
    int deleteAccount();
}
