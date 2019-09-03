package com.calvin.dao;


import com.calvin.entity.User;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public interface UserDao {
    /**
     * 注册
     *
     * @param user
     */
    void insert(User user);

    /**
     * 更新
     *
     * @param user
     */
    void update(User user);

    /**
     * 根据账户删除
     *
     * @param username
     */
    void delete(int uid);

    /**
     * 根据账户查询受灾用户信息
     *
     * @param uid
     * @return
     */
    User selectById(int uid);

    User selectByName(String username);

    /**
     * 查询所有受灾用户信息
     *
     * @return
     */
    List<User> selectAll();

    int querySosCount(int uid);
}
