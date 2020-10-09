package com.lian.controller;

import com.lian.entity.DriverInfo;
import com.lian.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("driverInfo")
public class DriverController {
    @Autowired
    private DriverService driverService;

    @RequestMapping("/selectAllId")
    @ResponseBody
    public List<String> selectAllId(){
        List<DriverInfo> list = driverService.selectAllId();
        List<String> objects = new ArrayList<>();
        for (DriverInfo di:list ) {
            objects.add(di.getId());
        }
        return objects;
    }
}
