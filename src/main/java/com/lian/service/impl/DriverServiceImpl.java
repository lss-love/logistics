package com.lian.service.impl;

import com.lian.dao.DriverDao;
import com.lian.entity.DriverInfo;
import com.lian.service.DriverService;
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
}
