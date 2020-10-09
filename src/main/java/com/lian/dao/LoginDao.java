package com.lian.dao;

import com.lian.entity.FunctionWithGroup;
import com.lian.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public interface LoginDao {
    User userlogin(String loginId);

    List<FunctionWithGroup> selectFunc(String loginId);

    void changePassword(@Param("newPassword")String newPassword, @Param("loginId") String loginId);
}
