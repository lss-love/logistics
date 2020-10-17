package com.lian.service.impl;

import com.github.pagehelper.PageHelper;
import com.lian.dao.GoodsBillDao;
import com.lian.entity.CargoReceiptDetail;
import com.lian.entity.CustomerInfo;
import com.lian.entity.GoodsBill;
import com.lian.entity.GoodsBillEvent;
import com.lian.service.GoodsBillService;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsBillServiceImpl implements GoodsBillService {
    @Autowired
    private GoodsBillDao goodsBillDao;

    @Override
    public GoodsBill selectCusByCode(String goodsBillCode) {
        GoodsBill goodsBill = goodsBillDao.selectCusByCode(goodsBillCode);
        return goodsBill;
    }

    @Override
    public List<GoodsBill> selectAllCusCode() {
        List<GoodsBill> list = goodsBillDao.selectAllCusCode();
        return list;
    }

    @Override
    public void add(GoodsBill goodsBill) {
        String goodsBillCode = "";
        goodsBillCode += RandomStringUtils.randomAlphabetic(5);
        goodsBill.setGoodsBillCode(goodsBillCode);
        goodsBillDao.add(goodsBill);
    }

    @Override
    public void addGoods(String goodsBillCode,CargoReceiptDetail cargoReceiptDetail) {
        cargoReceiptDetail.setGoodsBillDetailId(goodsBillCode);
        goodsBillDao.addGoods(cargoReceiptDetail);
    }

    @Override
    public GoodsBill selectByCode(String goodsBillCode) {
        return goodsBillDao.selectByCode(goodsBillCode);
    }

    @Override
    public List<GoodsBillEvent> selectByEvent(String id, Integer pageNum, Integer limit) {
        PageHelper.startPage(pageNum,limit);
        List<GoodsBillEvent> list = goodsBillDao.selectByEvent(id);
        return list;
    }

    @Override
    public List<GoodsBillEvent> selectByEvent1(Integer pageNum, Integer limit) {
        PageHelper.startPage(pageNum,limit);
        List<GoodsBillEvent> list = goodsBillDao.selectByEvent1();
        return list;
    }
}
