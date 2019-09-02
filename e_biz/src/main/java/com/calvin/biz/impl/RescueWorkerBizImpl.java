package com.calvin.biz.impl;

import com.calvin.biz.RescueWorkerBiz;
import com.calvin.dao.RescueWorkerDao;
import com.calvin.entity.RescueWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
@Service("rescueWorkerBiz")
public class RescueWorkerBizImpl implements RescueWorkerBiz {

    @Autowired
    private RescueWorkerDao rescueWorkerDao;

    public void add(RescueWorker rescueWorker) {
      rescueWorkerDao.insert(rescueWorker);
    }

    public void delete(String account) {
       rescueWorkerDao.delete(account);
    }

    public void update(RescueWorker rescueWorker) {
      rescueWorkerDao.update(rescueWorker);
    }

    public RescueWorker get(String account) {
        return rescueWorkerDao.select(account);
    }

    public List<RescueWorker> getAll() {
        return rescueWorkerDao.selectAll();
    }
}
