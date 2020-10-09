package com.lian.controller;

import com.lian.entity.FunctionWithGroup;
import com.lian.service.LoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Api(tags = "用户接口")
@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    /**
     * 用户登录
     * @param loginId 登录id
     * @param password 密码
     * @return
     */
    @ApiOperation("用户登录")
    @RequestMapping("/login.do")
    @ResponseBody
    public Map<String,Object> userlogin(String loginId, String password) {
        Map<String,Object> map = loginService.userlogin(loginId,password);
        return map;
    }

    /**
     * @PathVariable是spring3.0的一个新功能：接收请求路径中占位符的值
     *
     * @param loginId
     * @return
     */
    @RequestMapping("/selectFunc.do/{loginId}")
    @ResponseBody
    public List<FunctionWithGroup> selectFunc(@PathVariable("loginId") String loginId) {
        List<FunctionWithGroup> list = loginService.selectFunc(loginId);
        return list;
    }

}
