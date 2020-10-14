package com.lian.dao;

import com.lian.entity.DriverInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DriverDao {

    List<DriverInfo> selectAllId();

    void DriverInfo(DriverInfo driverInfo);

    List<DriverInfo> selectAllByPage();

    void delete(String id);

    DriverInfo selectById(String driverId);

    void update(DriverInfo driverInfo);
}
