package com.lian.inteceptor;

import com.lian.entity.User;
import com.lian.utils.StrUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInteceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //拦截之后获取他的虚拟路径
        String requestURI = request.getRequestURI();
        System.out.println(requestURI);
        //获取session中的信息
        User bankTable = (User) request.getSession().getAttribute(StrUtils.LOGIN_ID);
        //session中没有数据，说明没有登录
        if(bankTable == null){
            //AJAX请求下的未登录，跳转到login.html
            String header = request.getHeader("X-Requested-With");
            if (header != null && header.equals("XMLHttpRequest")) {
                //response.getWriter().write("{'code':0,'info':'未登录'}");
                response.getWriter().write("{\"code\":0, \"info\":\"未登录\"}");
            }else{
                //如果不是AJAX请求，直接重定向,项目根路径+目标页面
                response.sendRedirect(request.getContextPath()+"login.html");
            }
            //session中没有缓存，说明未登录，不放行
            return false;
        }
        //session中有缓存，说明已登录，放行
        return true;
    }
}