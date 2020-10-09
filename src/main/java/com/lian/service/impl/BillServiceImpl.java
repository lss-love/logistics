package com.lian.service.impl;

import com.github.pagehelper.PageHelper;
import com.lian.dao.BillDao;
import com.lian.entity.BillInfo;
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
    public void addRelease(String releasePerson, String receiveBillPerson, Date receiveBillTime, String acceptStation, String bill_code) {
        billDao.addRelease(releasePerson,receiveBillPerson,receiveBillTime,acceptStation,bill_code);
    }
}
