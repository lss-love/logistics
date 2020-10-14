package com.lian.service.impl;

import com.github.pagehelper.PageHelper;
import com.lian.dao.RouteDao;
import com.lian.entity.CityExpand;
import com.lian.entity.Region;
import com.lian.entity.RouteInfo;
import com.lian.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteServiceImpl implements RouteService {

    @Autowired
    private RouteDao routeDao;


    @Override
    public List<Region> findAllRegions() {
        List<Region> list = routeDao.findAllRegions();
        return list;
    }

    @Override
    public List<CityExpand> findAllExpands(Integer pageNum, Integer limit) {
        PageHelper.startPage(pageNum,limit);
        List<CityExpand> list = routeDao.findAllExpands();
        return list;
    }

    @Override
    public void add(Integer cityId, String rangeCity) {
        routeDao.add(cityId,rangeCity);
    }

    @Override
    public List<RouteInfo> findAllRoutes() {
        List<RouteInfo> list = routeDao.findAllRoutes();
        return list;
    }

    @Override
    public void delete(Integer id) {
        routeDao.delete(id);
    }

    @Override
    public void update(Integer expandId,Integer cityId,String rangeCity) {
        routeDao.update(expandId,cityId,rangeCity);
    }

    @Override
    public CityExpand findExpand(Integer expandId) {
        CityExpand cityExpand = routeDao.findExpand(expandId);
        return cityExpand;
    }
}
