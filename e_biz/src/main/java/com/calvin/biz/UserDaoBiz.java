package com.calvin.biz;

import com.calvin.entity.User;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public interface UserDaoBiz {

    void add(User user);

    void edit(User user);

    void remove(int uid);

    User getById(int uid);

    User getByName(String username);

    List<User> getAll();

    int querySosCount(int uid);
}
