package com.lian.service.impl;

import com.lian.dao.LoginDao;
import com.lian.entity.FunctionWithGroup;
import com.lian.entity.User;
import com.lian.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginDao loginDao;

    @Override
    public Map<String,Object> userlogin(String loginId, String password) {
        User user = loginDao.userlogin(loginId);
        Map<String, Object> map = new HashMap<>();
        if(user == null){
            throw new RuntimeException("账号不存在！");
        }else{
            if(password.equals(user.getPassword())){
                map.put("status","SUCCESS");
                map.put("user",user.getLoginId());
                return map;
            }else{
                throw new RuntimeException("密码错误!");
            }
        }
    }

    @Override
    public List<FunctionWithGroup> selectFunc(String loginId) {
        List<FunctionWithGroup> list = loginDao.selectFunc(loginId);
        return list;
    }

    @Override
    public void changePassword(String oldPassword, String newPassword,String loginId) {
        User user = loginDao.userlogin(loginId);
        String password = user.getPassword();
        if(password.equals(oldPassword)){
            loginDao.changePassword(newPassword,loginId);
        }else {
            throw new RuntimeException("密码错误!");
    }

    }
}
