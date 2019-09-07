package com.calvin.dao;

import com.calvin.entity.Sos;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public interface SosDao {

    void insert(Sos sos);

    List<Sos> select(int id);

    List<Sos> selectAll();

    void delete(int id);

}
