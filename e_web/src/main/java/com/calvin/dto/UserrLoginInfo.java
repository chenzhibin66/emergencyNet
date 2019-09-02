package com.calvin.dto;

import com.calvin.entity.User;

/**
 * @author Calvin
 * @Description:
 */
public class UserrLoginInfo {
    private int code;
    private String msg;
    private User user;

    public UserrLoginInfo(int code, String msg, User user) {
        this.code = code;
        this.msg = msg;
        this.user = user;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
