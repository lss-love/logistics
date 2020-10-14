package com.lian.controller;

import com.github.pagehelper.Page;
import com.lian.common.ResultJson;
import com.lian.common.TableResult;
import com.lian.entity.CityExpand;
import com.lian.entity.Region;
import com.lian.entity.RouteInfo;
import com.lian.service.RouteService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/route")
public class RouteController {

    @Autowired
    private RouteService routeService;

    /**
     * 查询所有的域
     * @return 域的集合
     */
    @RequestMapping("/findAllRegions")
    @ResponseBody
    public List<Region> findAllRegions(){
        List<Region> list = routeService.findAllRegions();
        return list;
    }

    /**
     * 查询所有城市详情
     * @param pageNum 页数
     * @param limit 页容量
     * @return 封装后的TableResult
     */
    @RequestMapping("/findAllExpands")
    @ResponseBody
    public TableResult findAllExpands(Integer pageNum,Integer limit){
        List<CityExpand> list = routeService.findAllExpands(pageNum,limit);
        long total = ((Page) list).getTotal();
        return new TableResult(200,"SUCCESS", (int) total,list);
    }

    /**
     * 添加城市范围
     * @param cityId 主要城市
     * @param rangeCity 范围城市
     * @return 成功返回code = 1，info
     */
    @RequestMapping("/add")
    @ResponseBody
    public ResultJson add(Integer cityId,String rangeCity){
        routeService.add(cityId,rangeCity);
        return new ResultJson(1,"添加城市信息成功!");
    }

    /**
     * 添加城市范围主要城市地点查找
      * @return 域的集合
     */
    @RequestMapping("/findLeftRegions")
    @ResponseBody
    public List<Region> findLeftRegions(){
        List<Region> list = routeService.findAllRegions();
        return list;
    }

    /**
     * 查找所有线路
     * @return 线路的集合
     */
    @RequestMapping("/findAllRoutes")
    @ResponseBody
    public List<RouteInfo> findAllRoutes(){
        List<RouteInfo> list = routeService.findAllRoutes();
        return list;
    }

    /**
     * 根据城市范围删除对应信息
     * @param id 被删除的信息id
     * @return 成功返回code =1 ，info
     */
    @RequestMapping("/delete/{id}")
    @ResponseBody
    public ResultJson delete(@PathVariable("id") Integer id){
        routeService.delete(id);
        return new ResultJson(1,"删除城市信息成功!");
    }

    /**
     * 修改城市信息
     * @param expandId 被修改城市的id
     * @return 修改成功返回code = 1，info
     */
    @RequestMapping("/update/{expandId}")
    @ResponseBody
    public ResultJson update(@PathVariable("expandId") Integer expandId, Integer cityId,String rangeCity){
        routeService.update(expandId,cityId,rangeCity);
        return new ResultJson(1,"修改城市信息成功!");
    }

    /**
     * 根据当前城市扩充表id查找所属信息
     * @return CityExpand实体类
     */
    @RequestMapping("/findExpand/{expandId}")
    @ResponseBody
    public CityExpand findExpand(@PathVariable("expandId") Integer expandId){
        CityExpand expand = routeService.findExpand(expandId);
        return expand;
    }
}
