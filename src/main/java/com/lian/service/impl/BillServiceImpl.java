package com.lian.service.impl;

import com.github.pagehelper.PageHelper;
import com.lian.dao.BillDao;
import com.lian.entity.BillInfo;
import com.lian.entity.BillRelease;
import com.lian.entity.GoodsBillEvent;
import com.lian.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BillServiceImpl implements BillService {

    @Autowired
    private BillDao billDao;

    @Override
    public List<BillInfo> findByPage(Integer limit, Integer limits) {
        PageHelper.startPage(limit,limits);
        List<BillInfo> list = billDao.findByPage();
        return list;
    }

    @Override
    public void addRelease(BillRelease billInfo) {
        //分发货运单
        billDao.addRelease(billInfo);
        //更新货运单事件
        GoodsBillEvent goodsBillEvent = new GoodsBillEvent();
        goodsBillEvent.setEventName("未结");
        goodsBillEvent.setGoodsBillId(billInfo.getBillCode());
        goodsBillEvent.setOccurTime(new Date());
        billDao.updateGoodsBillEvent(goodsBillEvent);
        //更新货运回执单
        //TODO

    }

    @Override
    public List<BillInfo> findNotRelease(Integer pageNum, Integer limit) {
        PageHelper.startPage(pageNum,limit);
        List<BillInfo> list = billDao.findNotRelease();
        return list;
    }
}
