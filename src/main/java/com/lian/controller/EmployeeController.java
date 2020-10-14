package com.lian.controller;

import com.github.pagehelper.Page;
import com.lian.common.ResultJson;
import com.lian.common.TableResult;
import com.lian.entity.DriverInfo;
import com.lian.entity.Employee;
import com.lian.entity.UserGroup;
import com.lian.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * 查询所有员工信息
     * @param pageNum 前端传入的页数
     * @param limit 前端传入的页容量
     * @return 封装后的实体类
     */
    @RequestMapping("/selectAllEmp")
    @ResponseBody
    public TableResult selectAllEmp(Integer pageNum,Integer limit){
        List<Employee> list = employeeService.selectAllEmp(pageNum,limit);
        long total = ((Page) list).getTotal();
        return new TableResult(200,"SUCCESS", (int) total,list);
    }

    /**
     * 根据指定employeeCode删除对应信息
     * @param employeeCode 被删除的employeeCode
     * @return 成功返回code = 1，infp
     */
    @RequestMapping("/deleteEmp/{employeeCode}")
    @ResponseBody
    public ResultJson deleteEmp(@PathVariable("employeeCode") String employeeCode){
        employeeService.deleteEmp(employeeCode);
        return new ResultJson(1,"删除成功!");
    }

    /**
     * 添加员工信息
     * @param employee 获取前端数据放在Employee实体类中
     * @return 成功返回code = 1，info
     */
    @RequestMapping("/addEmp")
    @ResponseBody
    public ResultJson addEmp(Employee employee){
        employeeService.addEmp(employee);
        return new ResultJson(1,"添加职员成功!");
    }

    /**
     * 查询所有用户组
     * @return 装有所有用户组信息的list集合
     */
    @RequestMapping("/selectAllUserFroup")
    @ResponseBody
    public List<UserGroup> selectAllUserFroup(){
        List<UserGroup> list = employeeService.selectAllUserFroup();
        return list;
    }

    /**
     * 根据账号查询当亲职员
     * @param employeeCode 被查询职员的账号
     * @return 当前code的职员的信息
     */
    @RequestMapping("/selectEmpByCode/{employeeCode}")
    @ResponseBody
    public Employee selectEmpByCode(@PathVariable("employeeCode") String employeeCode){
        Employee employee = employeeService.selectEmpByCode(employeeCode);
        return employee;
    }

    /**
     * 根据职员code修改职员信息
     * @param employeeCode 被修改职员的code
     * @return 成功返回code = 1
     */
    @RequestMapping("/updateEmp/{employeeCode}")
    @ResponseBody
    public ResultJson updateEmp(@PathVariable("employeeCode") String employeeCode,Employee employee){
        employeeService.updateEmp(employeeCode,employee);
        return new ResultJson(1,"修改职员信息成功!");
    }
}
