package com.calvin.dao;

import com.calvin.entity.RescueWorker;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public interface RescueWorkerDao {

    void insert(RescueWorker rescueWorker);

    void update(RescueWorker rescueWorker);

    void delete(String account);

    RescueWorker select(String account);

    List<RescueWorker> selectAll();

}
