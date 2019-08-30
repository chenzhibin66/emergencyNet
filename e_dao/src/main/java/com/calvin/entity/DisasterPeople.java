package com.calvin.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author Calvin
 * @Description:
 */
public class DisasterPeople {

    private String account;
    private String password;



    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
