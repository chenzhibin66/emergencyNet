package com.calvin.biz.impl;

import com.calvin.biz.SosBiz;
import com.calvin.dao.SosDao;
import com.calvin.entity.Sos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
@Service("sosBiz")
public class SosBizImpl implements SosBiz {

    @Autowired
    private SosDao sosDao;

    public void sos(Sos sos) {
        sosDao.insert(sos);
    }

    public List<Sos> get(int uid) {
        return sosDao.select(uid);
    }


    public List<Sos> getAll() {
        return sosDao.selectAll();
    }
}
