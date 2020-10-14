package com.lian.service.impl;

import com.github.pagehelper.PageHelper;
import com.lian.dao.EmployeeDao;
import com.lian.entity.Employee;
import com.lian.entity.UserGroup;
import com.lian.service.EmployeeService;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public List<Employee> selectAllEmp(Integer pageNum, Integer limit) {
        PageHelper.startPage(pageNum,limit);
        List<Employee> list = employeeDao.selectAllEmp();
        return list;
    }

    @Override
    public void deleteEmp(String employeeCode) {
        employeeDao.deleteEmp(employeeCode);
    }

    @Override
    public void addEmp(Employee employee) {
        String employee_code = "";
        employee_code+= RandomStringUtils.randomAlphabetic(5);
        employee.setEmployeeCode(employee_code);
        employeeDao.addEmp(employee);
    }

    @Override
    public List<UserGroup> selectAllUserFroup() {
        List<UserGroup> list = employeeDao.selectAllUserFroup();
        return list;
    }

    @Override
    public Employee selectEmpByCode(String employeeCode) {
        Employee employee = employeeDao.selectEmpByCode(employeeCode);
        return employee;
    }

    @Override
    public void updateEmp(String employeeCode,Employee employee) {
        employee.setEmployeeCode(employeeCode);
        employeeDao.updateEmp(employee);
    }
}
