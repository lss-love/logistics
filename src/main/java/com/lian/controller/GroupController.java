package com.lian.controller;

import com.github.pagehelper.Page;
import com.lian.common.ResultJson;
import com.lian.common.TableResult;
import com.lian.entity.Function;
import com.lian.entity.FunctionWithGroup;
import com.lian.entity.UserGroup;
import com.lian.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class GroupController{
    @Autowired
    private GroupService groupService;

    /**
     * 查询所有用户组信息
     * @param pageNum 页数
     * @param limit 页容量
     * @return 封装之后的TableResult类
     */
    @RequestMapping("/selectAllGroup")
    @ResponseBody
    public TableResult selectAllGroup(Integer pageNum,Integer limit){
        List<UserGroup> list = groupService.selectAllGroup(pageNum,limit);
        long total = ((Page) list).getTotal();
        return new TableResult(200,"SUCCESS", (int) total,list);
    }

    /**
     * 根据id删除对应的用户组
     * @param id 被删除用户组的id
     * @return 成功返回的信息
     */
    @RequestMapping("/deleteGroup/{id}")
    @ResponseBody
    public ResultJson deleteGroup(@PathVariable("id") int id){
        groupService.deleteGroup(id);
        return new ResultJson(1,"删除成功!");
    }

    /**
     * 根据组id查询当前组的描述和组名字
     * @param groupId 被查询的组id
     * @return 该组id的信息
     */
    @RequestMapping("/selectGroup/{groupId}")
    @ResponseBody
    public UserGroup selectGroup(@PathVariable("groupId") int groupId){
        UserGroup userGroup = groupService.selectGroup(groupId);
        return userGroup;
    }

    /**
     * 修改用户组
     * @param groupName 被修改的用户组名
     * @param description 被修改的用户组描述
     * @param groupId 被修改的用户组id
     * @return 成功返回code=  1,info等
     */
    @RequestMapping("/updateDescription/{groupId}")
    @ResponseBody
    public ResultJson updateDescription(String groupName,String description,@PathVariable("groupId") int groupId){
        groupService.updateDescription(groupName,description,groupId);
        return new ResultJson(1,"修改用户组成功!");
    }

    /**
     * 查询所有用户组
     * @return list集合，里面装所有UserGroup信息
     */
    @RequestMapping("/selectAllUserGroup")
    @ResponseBody
    public List<UserGroup> selectAllUserGroup(){
        List<UserGroup> list = groupService.selectAllUserGroup();
        return list;
    }

    /**
     * 查询所有的功能
     * @return list集合，里面装所有Function信息
     */
    @RequestMapping("/selectAllFunction")
    @ResponseBody
    public List<Function> selectAllFunction(){
        List<Function> list = groupService.selectAllFunction();
        return list;
    }

    /**
     * 根据组id查找对应的函数id
     * @param value 组id
     * @return list集合，里面装所有FunctionWithGroup信息
     */
    @RequestMapping("/selectFunctionByGroup/{value}")
    @ResponseBody
    public List<FunctionWithGroup> selectFunctionByGroup(@PathVariable("value") int value){
        System.out.println(value);
        List<FunctionWithGroup> list = groupService.selectFunctionByGroup(value);
        return list;
    }

    /**
     * 添加用户组
     * @param groupName 用户组名字
     * @param description 用户组描述
     * @return 添加成功返回code = 1
     */
    @RequestMapping("/addGroup")
    @ResponseBody
    public ResultJson addGroup(String groupName,String description){
        groupService.addGroup(groupName,description);
        return new ResultJson(1,"添加用户组成功!");
    }

    /**
     * 添加用户function功能
     * @param groupId 添加功能的组id
     * @param array 被添加功能的function  id
     * @return
     */
    @RequestMapping("/addNewFunc")
    @ResponseBody
    public ResultJson addNewFunc(int groupId, @RequestParam("array []") int [] array){
        System.out.println(groupId+" "+array);
        groupService.addNewFunc(groupId,array);
        return new ResultJson(1,"添加用户组功能成功!");
    }

}
