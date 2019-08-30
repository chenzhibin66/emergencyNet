package com.calvin.biz;

import com.calvin.entity.Sos;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public interface SosBiz {

    void sos(Sos sos);

    Sos get(String sosPeople);

    List<Sos> getAll();
}
