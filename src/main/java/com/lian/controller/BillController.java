package com.lian.controller;

import com.github.pagehelper.Page;
import com.lian.common.ResultJson;
import com.lian.common.TableResult;
import com.lian.entity.BillInfo;
import com.lian.entity.BillRelease;
import com.lian.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/bill")
public class BillController {

    @Autowired
    private BillService billService;

    /**
     * 查询所有未分发的订单
     *
     * @param pageNum 页数
     * @param limit   页容量
     * @return 封装后的TableResult类
     */
    @RequestMapping("/findNotRelease")
    @ResponseBody
    public TableResult findNotRelease(Integer pageNum, Integer limit) {
        List<BillInfo> list = billService.findNotRelease(pageNum, limit);
        long total = ((Page) list).getTotal();
        return new TableResult(200, "seuccess", (int) total, list);
    }

    /**
     * 查询所有票据
     * @param pageNum 页数
     * @param limit   页容量
     * @return 封装后的TableResult类
     */
    @RequestMapping("/findByPage")
    @ResponseBody
    public TableResult findByPage(Integer pageNum, Integer limit) {
        List<BillInfo> list = billService.findByPage(pageNum, limit);
        long total = ((Page) list).getTotal();
        return new TableResult(200, "seuccess", (int) total, list);
    }

    /**
     * 分发货物订单
     * @return 成功返回info= SUCCESS
     */
    @RequestMapping("/addRelease/{bill_code}")
    @ResponseBody
    public ResultJson addRelease(@PathVariable("bill_code") String bill_code, BillRelease billInfo) {
        billInfo.setBillCode(bill_code);
        billService.addRelease(billInfo);
        return new ResultJson(1, "SUCCESS");
    }
}
