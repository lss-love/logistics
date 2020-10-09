package com.lian.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 用户表
 * @author LSs
 */

@ApiModel("用户")
public class User {
    @ApiModelProperty("账号")
    private String loginId;
    @ApiModelProperty("是否在线")
    private byte ifOnline;
    @ApiModelProperty("密码")
    private String password;

    public User() {
    }

    public User(String loginId, byte ifOnline, String password) {
        this.loginId = loginId;
        this.ifOnline = ifOnline;
        this.password = password;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public byte getIfOnline() {
        return ifOnline;
    }

    public void setIfOnline(byte ifOnline) {
        this.ifOnline = ifOnline;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
