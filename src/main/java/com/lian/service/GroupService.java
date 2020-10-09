package com.lian.service;

import com.lian.entity.Function;
import com.lian.entity.FunctionWithGroup;
import com.lian.entity.UserGroup;

import java.util.List;

public interface GroupService {

    List<UserGroup> selectAllGroup(Integer pageNum, Integer limit);

    void deleteGroup(int id);

    UserGroup selectGroup(int groupId);

    void updateDescription(String groupName, String description, int groupId);

    List<UserGroup> selectAllUserGroup();

    List<Function> selectAllFunction();

    List<FunctionWithGroup> selectFunctionByGroup(int value);

    void addGroup(String groupName, String description);

    void addNewFunc(int groupId, int[] array);
}
