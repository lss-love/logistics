package com.lian.controller;

import com.github.pagehelper.Page;
import com.lian.common.ResultJson;
import com.lian.common.TableResult;
import com.lian.entity.DriverInfo;
import com.lian.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("driverInfo")
public class DriverController {
    @Autowired
    private DriverService driverService;

    /**
     * 查询所欲司机的d
     * @return 装有所有司机id的list集合
     */
    @RequestMapping("/selectAllId")
    @ResponseBody
    public List<String> selectAllId(){
        List<DriverInfo> list = driverService.selectAllId();
        List<String> objects = new ArrayList<>();
        for (DriverInfo di:list ) {
            objects.add(di.getId());
        }
        return objects;
    }

    /**
     * 添加司机信息
     * @param driverInfo 获取前端数据放在DriverInfo实体类中
     * @return 成功返回code = 1，info
     */
    @RequestMapping("/add")
    @ResponseBody
    public ResultJson addDriver(DriverInfo driverInfo){
        driverService.addDriver(driverInfo);
        return new ResultJson(1,"添加司机成功!");
    }

    /**
     * 查询素有订单
     * @param pageNum 前端传入的页数
     * @param limit 前端传入的页容量
     * @return 成功返回类TableResult
     */
    @RequestMapping("/selectAllByPage")
    @ResponseBody
    public TableResult selectAllByPage(Integer pageNum,Integer limit){
        List<DriverInfo> list = driverService.selectAllByPage(pageNum,limit);
        long total = ((Page) list).getTotal();
        return new TableResult(200,"success", (int) total,list);
    }

    /**
     * 根据指定id删除对应信息
     * @param id 被删除的id
     * @return 成功返回code = 1，infp
     */
    @RequestMapping("/delete/{id}")
    @ResponseBody
    public ResultJson delete(@PathVariable("id") String id){
        driverService.delete(id);
        return new ResultJson(1,"删除成功!");
    }

    /**
     * 根据司机id查找司机的详细信息
     * @param driverId 被查找司机的id
     * @return 司机信息挡在实体类中农
     */
    @RequestMapping("/selectById/{driverId}")
    @ResponseBody
    public DriverInfo selectById(@PathVariable("driverId") String driverId){
        return driverService.selectById(driverId);
    }

    /**
     * 修改司机信息
     * @param driverId 被修改司机的id
     * @return 成功返回code = 1，info
     */
    @RequestMapping("/update/{driverId}")
    @ResponseBody
    public ResultJson update(@PathVariable("driverId") String driverId,DriverInfo driverInfo){
        System.out.println(driverInfo);
        driverService.update(driverId,driverInfo);
        return new ResultJson(1,"修改成功!");
    }

}
