package com.lian.service;

import com.lian.entity.DriverInfo;

import java.util.List;

public interface DriverService {
    List<DriverInfo> selectAllId();

    void addDriver(DriverInfo driverInfo);

    List<DriverInfo> selectAllByPage(Integer pageNum, Integer limit);

    void delete(String id);

    DriverInfo selectById(String driverId);

    void update(String driverId, DriverInfo driverInfo);
}
