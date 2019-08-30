package com.calvin.dto;

import com.calvin.entity.DisasterPeople;

/**
 * @author Calvin
 * @Description:
 */
public class DisasterLoginInfo {
    private int code;
    private String msg;
    private DisasterPeople disasterPeople;

    public DisasterLoginInfo(int code, String msg, DisasterPeople disasterPeople) {
        this.code = code;
        this.msg = msg;
        this.disasterPeople = disasterPeople;
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

    public DisasterPeople getDisasterPeople() {
        return disasterPeople;
    }

    public void setDisasterPeople(DisasterPeople disasterPeople) {
        this.disasterPeople = disasterPeople;
    }
}
