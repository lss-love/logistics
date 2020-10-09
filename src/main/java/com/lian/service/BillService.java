package com.lian.service;

import com.lian.entity.BillInfo;

import java.util.Date;
import java.util.List;

public interface BillService {
    List<BillInfo> findByPage(Integer limit, Integer limits);

    void addRelease(String releasePerson, String receiveBillPerson, Date receiveBillTime, String acceptStation, String bill_code);
}
