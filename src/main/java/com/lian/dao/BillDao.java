package com.lian.dao;

import com.lian.entity.BillInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface BillDao {
    List<BillInfo> findByPage();

    void addRelease(@Param("releasePerson") String releasePerson,@Param("receiveBillPerson") String receiveBillPerson, @Param("receiveBillTime") Date receiveBillTime, @Param("acceptStation") String acceptStation, @Param("bill_code") String bill_code);
}
