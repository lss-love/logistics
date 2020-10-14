package com.lian.service;

import com.lian.entity.Employee;
import com.lian.entity.UserGroup;

import java.util.List;

public interface EmployeeService {
    List<Employee> selectAllEmp(Integer pageNum, Integer limit);

    void deleteEmp(String employeeCode);

    void addEmp(Employee employee);

    List<UserGroup> selectAllUserFroup();

    Employee selectEmpByCode(String employeeCode);

    void updateEmp(String employeeCode,Employee employee);
}
