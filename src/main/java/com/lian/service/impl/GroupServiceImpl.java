package com.lian.service.impl;

import com.github.pagehelper.PageHelper;
import com.lian.dao.GroupDao;
import com.lian.entity.Function;
import com.lian.entity.FunctionWithGroup;
import com.lian.entity.UserGroup;
import com.lian.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {
    @Autowired
    private GroupDao groupDao;

    @Override
    public List<UserGroup> selectAllGroup(Integer pageNum, Integer limit) {
        PageHelper.startPage(pageNum,limit);
        List<UserGroup> list = groupDao.selectAllGroup();
        return list;
    }

    @Override
    public void deleteGroup(int id) {
        groupDao.deleteGroup(id);
    }

    @Override
    public UserGroup selectGroup(int groupId) {
        UserGroup userGroup = groupDao.selectGroup(groupId);
        return userGroup;
    }

    @Override
    public void updateDescription(String groupName, String description, int groupId) {
        groupDao.updateDescription(groupId,description,groupName);
    }

    @Override
    public List<UserGroup> selectAllUserGroup() {
        List<UserGroup> list = groupDao.selectAllGroup();
        return list;
    }

    @Override
    public List<Function> selectAllFunction() {
        List<Function> list = groupDao.selectAllFunction();
        return list;
    }

    @Override
    public List<FunctionWithGroup> selectFunctionByGroup(int value) {
        List<FunctionWithGroup> list = groupDao.selectFunctionByGroup(value);
        return list;
    }

    @Override
    public void addGroup(String groupName, String description) {
        groupDao.addGroup(groupName,description);
    }

    @Override
    public void addNewFunc(int groupId, int[] array) {
        FunctionWithGroup functionWithGroup = new FunctionWithGroup();
        System.out.println(array);
        for (int fwg:array) {
            functionWithGroup.setFunctionId(fwg);
            functionWithGroup.setGroupId(groupId);
            groupDao.saveFunction(functionWithGroup);
        }
    }
}
