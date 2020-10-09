package com.lian.dao;

import com.lian.entity.DriverInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DriverDao {

    List<DriverInfo> selectAllId();

}
