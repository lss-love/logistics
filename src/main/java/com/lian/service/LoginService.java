package com.lian.service;

import com.lian.entity.FunctionWithGroup;

import java.util.List;
import java.util.Map;

public interface LoginService {
    Map<String,Object> userlogin(String loginId, String password);

    List<FunctionWithGroup> selectFunc(String loginId);

    void changePassword(String oldPassword, String newPassword,String loginId);
}
