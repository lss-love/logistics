package com.lian.dao;

import com.lian.entity.CityExpand;
import com.lian.entity.Region;
import com.lian.entity.RouteInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RouteDao {

    List<Region> findAllRegions();

    List<CityExpand> findAllExpands();

    void add(@Param("cityId") Integer cityId,@Param("rangeCity") String rangeCity);

    List<RouteInfo> findAllRoutes();

    void delete(Integer id);

    void update(@Param("expandId") Integer expandId,@Param("cityId") Integer cityId,@Param("rangeCity") String rangeCity);

    CityExpand findExpand(Integer expandId);
}
