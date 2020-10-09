package com.lian.controller;

import com.lian.common.ResultJson;
import com.lian.entity.FunctionWithGroup;
import com.lian.entity.User;
import com.lian.service.LoginService;
import com.lian.utils.StrUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
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
    public Map<String,Object> userlogin(String loginId, String password, HttpSession session) {
        User user = loginService.getUser(loginId);
        session.setAttribute(StrUtils.LOGIN_ID,user);
        Map<String,Object> map = loginService.userlogin(loginId,password);
        return map;
    }

    /**
     * 退出功能
     * @param session 共享域，清除共享域中的用户数据
     * @return 成功返回code = 1，info
     */
    @RequestMapping("/loginOut.do")
    @ResponseBody
    public ResultJson loginOut(HttpSession session) {
        session.removeAttribute(StrUtils.LOGIN_ID);
        return new ResultJson(1,"退出成功!");
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

    /**
     * 修改当前用户密码
     * @param oldPassword 前端传入的老密码
     * @param newPassword 前端传入的新密码
     * @return 成功返回code= 1
     */
    @RequestMapping("/change.do")
    @ResponseBody
    public ResultJson changePassword(String oldPassword,String newPassword,String loginId) {
        loginService.changePassword(oldPassword,newPassword,loginId);
        return new ResultJson(1,"修改密码成功!");
    }

}
