package com.calvin.biz.impl;

import com.calvin.biz.DisasterPeopleBiz;
import com.calvin.dao.DisasterPeopleDao;
import com.calvin.entity.DisasterPeople;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
@Service("disasterPeopleBiz")
public class DisasterPeopleBizImpl implements DisasterPeopleBiz {

    @Autowired
    private DisasterPeopleDao disasterPeopleDao;

    public void add(DisasterPeople disasterPeople) {
        disasterPeopleDao.insert(disasterPeople);
    }

    public void edit(DisasterPeople disasterPeople) {
        disasterPeopleDao.update(disasterPeople);
    }

    public void remove(String account) {
        disasterPeopleDao.delete(account);
    }

    public DisasterPeople get(String account) {
        return disasterPeopleDao.select(account);
    }

    public List<DisasterPeople> getAll() {
        return disasterPeopleDao.selectAll();
    }
}
