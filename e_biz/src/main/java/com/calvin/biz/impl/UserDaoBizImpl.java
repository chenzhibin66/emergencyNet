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

    public void remove(int uid) {
        userDao.delete(uid);
    }

    public User getById(int uid) {
        return userDao.selectById(uid);
    }

    public User getByName(String username) {
        return userDao.selectByName(username);
    }

    public List<User> getAll() {
        return userDao.selectAll();
    }

    public int querySosCount(int uid) {
        return userDao.querySosCount(uid);
    }
}
