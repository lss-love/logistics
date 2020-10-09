package com.lian.dao;

import com.lian.entity.FunctionWithGroup;
import com.lian.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoginDao {
    User userlogin(String loginId);

    List<FunctionWithGroup> selectFunc(String loginId);
}
