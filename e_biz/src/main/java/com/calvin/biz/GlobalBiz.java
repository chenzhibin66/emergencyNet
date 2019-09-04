package com.calvin.biz;

import com.calvin.entity.Admin;

/**
 * @author Calvin
 * @Description:
 */
public interface GlobalBiz {

    Admin login(String sn, String password);
}
