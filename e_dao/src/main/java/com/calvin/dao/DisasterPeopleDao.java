package com.calvin.dao;



import com.calvin.entity.DisasterPeople;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public interface DisasterPeopleDao {
    /**
     * 注册
     * @param disasterPeople
     */
    void insert(DisasterPeople disasterPeople);

    /**
     * 更新
     * @param disasterPeople
     */
    void update(DisasterPeople disasterPeople);

    /**
     * 根据账户删除
     * @param account
     */
    void delete(String account);

    /**
     * 根据账户查询受灾用户信息
     * @param account
     * @return
     */
    DisasterPeople select(String account);

    /**
     * 查询所有受灾用户信息
     * @return
     */
    List<DisasterPeople> selectAll();
}
