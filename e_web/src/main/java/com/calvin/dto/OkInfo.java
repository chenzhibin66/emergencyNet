package com.calvin.dto;

/**
 * @author Calvin
 * @Description:
 */
public class OkInfo {
    //1--成功   0--失败
    private int code;

    public OkInfo(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
