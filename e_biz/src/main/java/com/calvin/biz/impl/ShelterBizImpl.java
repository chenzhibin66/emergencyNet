package com.calvin.biz.impl;

import com.calvin.biz.ShelterBiz;
import com.calvin.dao.ShelterDao;
import com.calvin.entity.Shelter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
@Service("shelterBiz")
public class ShelterBizImpl implements ShelterBiz {

    @Autowired
    private ShelterDao shelterDao;

    public List<Shelter> getAll() {
        return shelterDao.selectAll();
    }

    public void add(Shelter shelter) {
       shelterDao.insert(shelter);
    }


}
