package com.lian.service;

import com.lian.entity.CityExpand;
import com.lian.entity.Region;
import com.lian.entity.RouteInfo;

import java.util.List;

public interface RouteService {
    List<Region> findAllRegions();

    List<CityExpand> findAllExpands(Integer pageNum, Integer limit);

    void add(Integer cityId, String rangeCity);

    List<RouteInfo> findAllRoutes();

    void delete(Integer id);

    void update(Integer expandId,Integer cityId,String rangeCity);

    CityExpand findExpand(Integer expandId);
}
