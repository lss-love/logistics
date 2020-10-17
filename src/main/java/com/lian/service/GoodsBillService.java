package com.lian.service;

import com.lian.entity.CargoReceiptDetail;
import com.lian.entity.CustomerInfo;
import com.lian.entity.GoodsBill;
import com.lian.entity.GoodsBillEvent;

import java.util.List;

public interface GoodsBillService {
    GoodsBill selectCusByCode(String goodsBillCode);

    List<GoodsBill> selectAllCusCode();

    void add(GoodsBill goodsBill);

    void addGoods(String goodsBillCode,CargoReceiptDetail cargoReceiptDetail);

    GoodsBill selectByCode(String goodsBillCode);

    List<GoodsBillEvent> selectByEvent(String id, Integer pageNum, Integer limit);

    List<GoodsBillEvent> selectByEvent1(Integer pageNum, Integer limit);
}
