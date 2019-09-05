package com.calvin.dao;

import com.calvin.entity.Shelter;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public interface ShelterDao {

    List<Shelter> selectAll();

    void insert(Shelter shelter);

}
