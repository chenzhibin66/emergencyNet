package com.calvin.biz.impl;

import com.calvin.biz.GlobalBiz;
import com.calvin.dao.AdminDao;
import com.calvin.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Calvin
 * @Description:
 */
@Service("globalBiz")
public class GlobalBizImpl implements GlobalBiz {

    @Autowired
    private AdminDao adminDao;

    public Admin login(String sn, String password) {
        Admin admin = adminDao.select(sn);
        if (admin!=null && admin.getPassword().equals(password)){
            return admin;
        }
        return null;
    }
}
