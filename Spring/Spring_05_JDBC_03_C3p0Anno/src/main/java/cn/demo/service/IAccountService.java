package cn.demo.service;

import cn.demo.entry.Account;

import java.util.List;

public interface IAccountService {
    List<Account> findAccountAll();
    Account findAccountById(Integer acid);
    int saveAccount(Account account);
    int deleteAccountById(Integer acid);
    int updateAccount(Account account);
}
