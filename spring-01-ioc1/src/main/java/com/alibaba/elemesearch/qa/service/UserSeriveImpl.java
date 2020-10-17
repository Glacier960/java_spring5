package com.alibaba.elemesearch.qa.service;

import com.alibaba.elemesearch.qa.dao.UserDao;
import com.alibaba.elemesearch.qa.dao.UserDaoImpl;
import com.alibaba.elemesearch.qa.dao.UserMySQLImpl;
import com.alibaba.elemesearch.qa.dao.UserOracleImpl;

public class UserSeriveImpl implements UserService{
    //private UserDao userDao = new UserDaoImpl();
    //private UserDao userDao = new UserMySQLImpl();
    //private UserDao userDao = new UserOracleImpl();
    private UserDao userDao;

    //利用set进行动态实现值得注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
