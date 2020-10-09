package com.lian.common;

import java.io.Serializable;

public class ResultJson implements Serializable {
    private int code;
    private Object info;

    public ResultJson() {
    }
    public ResultJson(int code, Object info) {
        this.code = code;
        this.info = info;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "ResultJson{" +
                "code=" + code +
                ", info=" + info +
                '}';
    }
}
