package com.calvin.biz;

import com.calvin.entity.Sos;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public interface SosBiz {

    void sos(Sos sos);

    List<Sos> get(int id);

    List<Sos> getAll();

    void remove(int id);

     int countSos();
}
