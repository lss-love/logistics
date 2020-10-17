package com.lian.controller;

import com.github.pagehelper.Page;
import com.lian.common.ResultJson;
import com.lian.common.TableResult;
import com.lian.dao.GoodsBillDao;
import com.lian.entity.BillInfo;
import com.lian.entity.CargoReceiptDetail;
import com.lian.entity.GoodsBill;
import com.lian.entity.GoodsBillEvent;
import com.lian.service.GoodsBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/goodsBill")
public class GoodsBillController {
    @Autowired
    private GoodsBillService goodsBillService;

    /**
     * 添加货运单
     * @param goodsBill 货运单信息
     * @return 成功返回code = 1,info
     */
    @RequestMapping("/add")
    public ResultJson add(GoodsBill goodsBill){
        goodsBillService.add(goodsBill);
        return new ResultJson(1,"添加成功");
    }

    /**
     * 在添加货物单之后的添加货物操作
     * @param cargoReceiptDetail 要添加的货物信息
     * @return 成功返回code = 1
     */
    @RequestMapping("/addGoods")
    public ResultJson addGoods(@PathVariable("goodsBillCode") String goodsBillCode,CargoReceiptDetail cargoReceiptDetail){
        goodsBillService.addGoods(goodsBillCode,cargoReceiptDetail);
        return new ResultJson(1,"添加成功");
    }

    /**
     * 根据货物订单码查找对应的货物订单信息
     * @param goodsBillCode
     * @return
     */
    @RequestMapping("/selectByCode/{goodsBillCode}")
    public GoodsBill selectByCode(@PathVariable("goodsBillCode")String goodsBillCode){
        GoodsBill goodsBill = goodsBillService.selectByCode(goodsBillCode);
        return goodsBill;
    }

    /**
     * 根据运单状态查询货运单事件
     * @param id 事件名字
     * @param pageNum 页数，默认为1
     * @param limit 页容量，默认为10
     * @return 封装结果集TableResult
     */
    @RequestMapping("/selectByEvent/{id}")
    public TableResult selectByEvent(@PathVariable("id")String id, Integer pageNum, Integer limit){
        List<GoodsBillEvent> list = goodsBillService.selectByEvent(id,pageNum,limit);
        long total = ((Page) list).getTotal();
        return new TableResult(200,"SUCCESS", (int) total,list);
    }

    /**
     * 查询所有GoodsBill信息
     * @return 所有GoodsBill信息
     */
    @RequestMapping("/selectAllCusCode")
    public List<GoodsBill> selectAllCusCode(){
        List<GoodsBill> list = goodsBillService.selectAllCusCode();
        return list;
    }

    /**
     * 查询所有运货单事件
     * @param pageNum 页数，默认为1
     * @param limit 页容量，默认为10
     * @return 封装结果集TableResult
     */
    @RequestMapping("/selectByEvent")
    public TableResult selectByEvent1(Integer pageNum, Integer limit){
        List<GoodsBillEvent> list = goodsBillService.selectByEvent1(pageNum,limit);
        long total = ((Page) list).getTotal();
        return new TableResult(200,"SUCCESS", (int) total,list);
    }
}
