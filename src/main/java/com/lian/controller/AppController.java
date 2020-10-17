package com.lian.controller;

import com.github.pagehelper.Page;
import com.lian.common.ResultJson;
import com.lian.common.TableResult;
import com.lian.entity.CustomerInfo;
import com.lian.entity.GoodsBill;
import com.lian.service.AppService;
import com.lian.service.GoodsBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    private AppService appService;
    @Autowired
    private GoodsBillService goodsBillService;

    /**
     * 根据顾客code查询顾客信息
     * @param customerCode 被查询顾客code
     * @return 被查询顾客的详细信息
     */
    @RequestMapping("/selectCusByCode/{customerCode}")
    @ResponseBody
    public CustomerInfo selectCusByCode(@PathVariable("customerCode") String customerCode){
        CustomerInfo list = appService.selectCusByCode(customerCode);
        return list;
    }

    /**
     * 查询所有顾客的信息
     * @param pageNum 前端传入的页数
     * @param limit 前端传入的页容量
     * @return 封装之后的TableResult类
     */
    @RequestMapping("/selectAllCus")
    @ResponseBody
    public TableResult selectAllCus(Integer pageNum,Integer limit){
        List<CustomerInfo> list = appService.selectAllCus(pageNum,limit);
        long total = ((Page) list).getTotal();
        return new TableResult(200,"seuccess", (int) total,list);
    }

    /**
     * 根据customerCode删除对应的顾客信息
     * @param customerCode 被删除的顾客的customerCode
     * @return 成功返回code = 1，info
     */
    @RequestMapping("/deleteCus/{customerCode}")
    @ResponseBody
    public ResultJson deleteCus(@PathVariable("customerCode") String customerCode){
        appService.deleteCus(customerCode);
        return new ResultJson(1,"删除成功!");
    }

    /**
     * 根据customerCode修改客户信息
     * @param customerCode 被修改客户的code
     * @param customerInfo 前端传入的更改信息
     * @return 修改成功返回code = 1，info
     */
    @RequestMapping("/updateCustomerInfo/{customerCode}")
    @ResponseBody
    public ResultJson updateCustomerInfo(@PathVariable("customerCode") String customerCode,CustomerInfo customerInfo){
        customerInfo.setCustomerCode(customerCode);
        appService.updateCustomerInfo(customerInfo);
        return new ResultJson(1,"修改客户信息成功!");
    }

    /**
     * 添加用户信息
     * @param customer 前端的参数，放在实体类里面
     * @return 添加成功返回code = 1，info
     */
    @RequestMapping("/addCus")
    @ResponseBody
    public ResultJson addCus(CustomerInfo customer){
        appService.addCus(customer);
        return new ResultJson(1,"添加客户成功!");
    }

    /**
     * 查询所有顾客
     * @return 装有所有顾客的List集合
     */
    @RequestMapping("/selectAllCusCode1")
    @ResponseBody
    public List<CustomerInfo> selectAllCusCode(){
        List<CustomerInfo> list = appService.selectAllCusCode();
        return list;
    }

    /**
     * 查询所有GoodsBill信息
     * @return 所有GoodsBill信息
     */
    @RequestMapping("/selectAllCusCode")
    public List<GoodsBill> selectAllCusCode2(){
        List<GoodsBill> list = goodsBillService.selectAllCusCode();
        return list;
    }

}
