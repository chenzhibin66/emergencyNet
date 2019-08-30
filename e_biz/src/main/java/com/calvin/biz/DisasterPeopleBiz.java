package com.calvin.biz;

import com.calvin.entity.DisasterPeople;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public interface DisasterPeopleBiz {

    void add(DisasterPeople disasterPeople);

    void edit(DisasterPeople disasterPeople);

    void remove(String account);

    DisasterPeople get(String account);

    List<DisasterPeople> getAll();
}
