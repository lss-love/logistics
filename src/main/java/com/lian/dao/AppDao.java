package com.lian.dao;

import com.lian.entity.CustomerInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppDao {
    CustomerInfo selectCusByCode(String customerCode);

    List<CustomerInfo> selectAllCus();

    void deleteCus(String customerCode);

    void updateCustomerInfo(CustomerInfo customerInfo);

    void addCus(CustomerInfo customerInfo);

}
