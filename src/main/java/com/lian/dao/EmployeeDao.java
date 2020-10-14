package com.lian.dao;

import com.lian.entity.Employee;
import com.lian.entity.UserGroup;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDao {

    List<Employee> selectAllEmp();

    void deleteEmp(String employeeCode);

    void addEmp(Employee employee);

    List<UserGroup> selectAllUserFroup();

    Employee selectEmpByCode(String employeeCode);

    void updateEmp(Employee employee);
}
