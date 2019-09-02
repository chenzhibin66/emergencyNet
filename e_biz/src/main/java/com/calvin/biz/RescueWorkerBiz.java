package com.calvin.biz;

import com.calvin.entity.RescueWorker;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public interface RescueWorkerBiz {

    void add(RescueWorker rescueWorker);

    void delete(String account);

    void update(RescueWorker rescueWorker);

    RescueWorker get(String account);

    List<RescueWorker> getAll();
}
