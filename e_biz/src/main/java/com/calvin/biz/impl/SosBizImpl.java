package com.calvin.biz.impl;

import com.calvin.biz.SosBiz;
import com.calvin.dao.SosDao;
import com.calvin.entity.Sos;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public class SosBizImpl implements SosBiz {

    @Autowired
    private SosDao sosDao;
    public void sos(Sos sos) {
        sosDao.insert(sos);
    }

    public Sos get(String sosPeople) {
        return sosDao.select(sosPeople);
    }

    public List<Sos> getAll() {
        return sosDao.selectAll();
    }
}
