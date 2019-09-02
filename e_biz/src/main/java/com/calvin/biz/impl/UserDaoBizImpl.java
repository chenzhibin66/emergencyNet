package com.calvin.biz.impl;

import com.calvin.biz.UserDaoBiz;
import com.calvin.dao.UserDao;
import com.calvin.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
@Service("disasterPeopleBiz")
public class UserDaoBizImpl implements UserDaoBiz {

    @Autowired
    private UserDao userDao;

    public void add(User user) {
        userDao.insert(user);
    }

    public void edit(User user) {
        userDao.update(user);
    }

    public void remove(String username) {
        userDao.delete(username);
    }

    public User get(String username) {
        return userDao.select(username);
    }

    public List<User> getAll() {
        return userDao.selectAll();
    }
}
