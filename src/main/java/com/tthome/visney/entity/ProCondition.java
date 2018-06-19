package com.tthome.visney.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 用于产品条件查询时封装查询条件
 *
 * @author NBUG
 * @date 2018/5/17 16:33
 */
@Data
public class ProCondition implements Serializable {

    private static final long serialVersionUID = 8544549333307596810L;

    private BigDecimal proPrice;
    //摆放位置
    private Integer positionId=0;
    //风格
    private Integer styleId=0;
    //类型
    private Integer typeId=0;
    //系列
    private Integer seriesId=0;
    //材质
    private Integer textureId=0;
    //是否根据时间排序
    private Integer orderByTime=0;
    //是否根据浏览数排序,默认根据浏览数查询
    private Integer orderByPageViewsCount=0;
    //是否根据价格排序
    private Integer orderByPrice=0;
}
