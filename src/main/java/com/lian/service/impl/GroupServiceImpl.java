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
        PageHelper.startPage(pageNum, limit);
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
        groupDao.updateDescription(groupId, description, groupName);
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
        groupDao.addGroup(groupName, description);
    }

    @Override
    public void addNewFunc(Integer groupId, Integer[] array) {
        List<FunctionWithGroup> list = groupDao.selectFunctionByGroup(groupId);

        //把array里面的数放到数组array1里面
        int[] array1 = new int[list.size()];
        int i = 0;
        for (FunctionWithGroup fwg : list) {
            array1[i] = fwg.getFunctionId();
        }

        FunctionWithGroup functionWithGroup = new FunctionWithGroup();
        //遍历数据库中的function，如果已存在相应的function，过滤掉不添加
        for (int i1 = 0; i1 < array.length; i1++) {
            int num = 0;

            for (int a = 1; a <= list.size(); a++) {
                if (array[i1] == array1[a-1]) {
                    num++;
                }
                if (a == list.size() && num == 0) {
                    functionWithGroup.setFunctionId(array[i1]);
                    functionWithGroup.setGroupId(groupId);
                    groupDao.saveFunction(functionWithGroup);
                }
            }
        }
    }

}