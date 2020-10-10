package com.lian.controller;

import com.github.pagehelper.Page;
import com.lian.common.ResultJson;
import com.lian.common.TableResult;
import com.lian.entity.CustomerInfo;
import com.lian.service.AppService;
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

    /**
     * 根据顾客code查询大年顾客信息
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
     * 修改客户信息
     * @param customerCode
     * @param customer
     * @param phone
     * @param fax
     * @param postCode
     * @param address
     * @param linkman
     * @param linkmanMobile
     * @param customerType
     * @param enterpriseProperty
     * @param enterpriseSize
     * @param email
     * @return 修改成功返回code = 1，info
     */
    @RequestMapping("/updateCustomerInfo/{customerCode}")
    @ResponseBody
    public ResultJson updateCustomerInfo(@PathVariable("customerCode") String customerCode,String customer,String phone,String fax,String postCode,String address,String linkman,
                                         String linkmanMobile,String customerType,String enterpriseProperty,String enterpriseSize,String email){
        CustomerInfo customerInfo = new CustomerInfo(customerCode,customer,phone,fax,postCode,address,linkman,linkmanMobile,customerType,enterpriseProperty,enterpriseSize,email);
        appService.updateCustomerInfo(customerInfo);
        return new ResultJson(1,"修改客户信息成功!");
    }

    /**
     * 添加用户信息
     * @return 修改成功返回code = 1，info
     */
    @RequestMapping("/addCus")
    @ResponseBody
    public ResultJson addCus(CustomerInfo customer){
        appService.addCus(customer);
        return new ResultJson(1,"添加客户成功!");
    }

}
