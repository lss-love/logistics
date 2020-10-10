package com.lian.service;

import com.lian.entity.CustomerInfo;

import java.util.List;

public interface AppService {
    CustomerInfo selectCusByCode(String customerCode);

    List<CustomerInfo> selectAllCus(Integer pageNum, Integer limit);

    void deleteCus(String customerCode);

    void updateCustomerInfo(CustomerInfo customerInfo);

    void addCus(CustomerInfo customerInfo);
}
