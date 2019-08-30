package com.calvin.dao;

import com.calvin.entity.Sos;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public interface SosDao {

    void insert(Sos sos);

    Sos select(String sosPeople);

    List<Sos> selectAll();
}
