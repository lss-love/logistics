package com.lian.convert;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 本类实现了Convert接口
 * 参数一维被转换类型，参数二是转换目标类型
 * 本类的作用是把字符串转换为Date数据类型的数据
 */
@Component
public class CustomerDateConvert implements Converter<String, Date> {
    //SimpleDateFormat最基本的类型转换器
    SimpleDateFormat[] sdfs = new SimpleDateFormat[]{
            new SimpleDateFormat("yyyy-MM-dd"),
            new SimpleDateFormat("yyyyMMdd"),
            new SimpleDateFormat("yyyy年MM月dd日"),
            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    };
    @Override
    public Date convert(String s) {
        if(s == null || s.isEmpty()){
            return null;
        }
        //遍历循环sdfs数组，找到与之相对应的情况，如果找不到就返回null；
        for(SimpleDateFormat sdf:sdfs){
            try {
                return sdf.parse(s);
            } catch (ParseException e) {
                continue;
            }
        }
        return null;
    }
}
