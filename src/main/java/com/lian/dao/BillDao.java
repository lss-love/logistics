package com.lian.dao;

import com.lian.entity.BillInfo;
import com.lian.entity.BillRelease;
import com.lian.entity.GoodsBillEvent;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface BillDao {
    List<BillInfo> findByPage();

    void addRelease(BillRelease billInfo);

    List<BillInfo> findNotRelease();

    void updateGoodsBillEvent(GoodsBillEvent goodsBillEvent);
}
