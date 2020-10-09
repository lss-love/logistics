package com.lian.dao;

import com.lian.entity.Function;
import com.lian.entity.FunctionWithGroup;
import com.lian.entity.UserGroup;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public interface GroupDao {
    List<UserGroup> selectAllGroup();

    void deleteGroup(int id);

    UserGroup selectGroup(int groupId);

    void updateDescription(@Param("groupId") int groupId, @PathVariable("description") String description,@Param("groupName") String groupName);

    List<Function> selectAllFunction();

    List<FunctionWithGroup> selectFunctionByGroup(int value);

    void addGroup(@Param("groupName") String groupName, @Param("description") String description);

    void saveFunction(FunctionWithGroup functionWithGroup);
}
