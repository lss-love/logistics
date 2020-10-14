package com.lian.service.impl;

import com.github.pagehelper.PageHelper;
import com.lian.dao.DriverDao;
import com.lian.entity.DriverInfo;
import com.lian.service.DriverService;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverServiceImpl implements DriverService {
    @Autowired
    private DriverDao driverDao;


    @Override
    public List<DriverInfo> selectAllId() {
        List<DriverInfo> list = driverDao.selectAllId();
        return list;
    }

    @Override
    public void addDriver(DriverInfo driverInfo) {
        String id = "";
        id+= RandomStringUtils.randomAlphabetic(5);
        driverInfo.setId(id);
        driverDao.DriverInfo(driverInfo);
    }

    @Override
    public List<DriverInfo> selectAllByPage(Integer pageNum, Integer limit) {
        PageHelper.startPage(pageNum,limit);
        List<DriverInfo> list = driverDao.selectAllByPage();
        return list;
    }

    @Override
    public void delete(String id) {
        driverDao.delete(id);
    }

    @Override
    public DriverInfo selectById(String driverId) {
        DriverInfo driverInfo = driverDao.selectById(driverId);
        return driverInfo;
    }

    @Override
    public void update(String driverId, DriverInfo driverInfo) {
        driverInfo.setId(driverId);
        driverDao.update(driverInfo);
    }
}
