package com.calvin.dto;

import com.calvin.entity.RescueWorker;

/**
 * @author Calvin
 * @Description:
 */
public class RescueWorkerLoginInfo {
    private int code;
    private String msg;
    private RescueWorker rescueWorker;

    public RescueWorkerLoginInfo(int code, String msg, RescueWorker rescueWorker) {
        this.code = code;
        this.msg = msg;
        this.rescueWorker = rescueWorker;
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

    public RescueWorker getRescueWorker() {
        return rescueWorker;
    }

    public void setRescueWorker(RescueWorker rescueWorker) {
        this.rescueWorker = rescueWorker;
    }
}
