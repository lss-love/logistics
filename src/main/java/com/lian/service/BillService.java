package com.lian.service;

import com.lian.entity.BillInfo;
import com.lian.entity.BillRelease;

import java.util.List;

public interface BillService {
    List<BillInfo> findByPage(Integer limit, Integer limits);

    void addRelease(BillRelease billInfo);

    List<BillInfo> findNotRelease(Integer pageNum, Integer limit);
}
