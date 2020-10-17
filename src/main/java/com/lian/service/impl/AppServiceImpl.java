package com.lian.service.impl;

import com.github.pagehelper.PageHelper;
import com.lian.dao.AppDao;
import com.lian.entity.CustomerInfo;
import com.lian.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.List;

@Service
public class AppServiceImpl implements AppService {
    @Autowired
    private AppDao appDao;

    @Override
    public CustomerInfo selectCusByCode(String customerCode) {
        CustomerInfo list = appDao.selectCusByCode(customerCode);
        return list;
    }

    @Override
    public List<CustomerInfo> selectAllCus(Integer pageNum, Integer limit) {
        PageHelper.startPage(pageNum,limit);
        List<CustomerInfo> list = appDao.selectAllCus();
        return list;
    }

    @Override
    public void deleteCus(String customerCode) {
        appDao.deleteCus(customerCode);
    }

    @Override
    public void updateCustomerInfo(CustomerInfo customerInfo) {
        appDao.updateCustomerInfo(customerInfo);
    }

    @Override
    public void addCus(CustomerInfo customerInfo) {
        String customerCode = "KH";
        customerCode+=RandomStringUtils.randomAlphabetic(5);
        customerInfo.setCustomerCode(customerCode);
        appDao.addCus(customerInfo);
    }

    @Override
    public List<CustomerInfo> selectAllCusCode() {
        List<CustomerInfo> list = appDao.selectAllCus();
        return list;
    }


}
