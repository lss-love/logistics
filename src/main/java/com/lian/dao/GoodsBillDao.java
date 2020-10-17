package com.lian.dao;

import com.lian.entity.CargoReceiptDetail;
import com.lian.entity.CustomerInfo;
import com.lian.entity.GoodsBill;
import com.lian.entity.GoodsBillEvent;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsBillDao {

    GoodsBill selectCusByCode(String goodsBillCode);

    List<GoodsBill> selectAllCusCode();

    void add(GoodsBill goodsBill);

    void addGoods(CargoReceiptDetail cargoReceiptDetail);

    GoodsBill selectByCode(String goodsBillCode);

    List<GoodsBillEvent> selectByEvent(String id);

    List<GoodsBillEvent> selectByEvent1();
}
