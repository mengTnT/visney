package com.tthome.visney.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class Product implements Serializable {

    private static final long serialVersionUID = -8482600895595230914L;

    private Integer proId;

    private String proName;

    private BigDecimal proPrice;
    //摆放位置
    private ProPosition proPosition;
    //风格
    private ProStyle proStyle;
    //类型
    private ProType proType;
    //系列
    private ProSeries proSeries;
    //材质
    private ProTexture proTexture;
    //品牌
    private Brand brand;
    //型号
    private ModleCode modleCode;
    //尺寸
    private Size size;
    //介绍
    private String proMsg;
    //浏览量
    private PageViews pageViews;
    //淘宝店链接地址
    private String proSrc;
    //添加时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date proAddTime;
    //更新时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date proUpdateTime;
    //是否上架，默认1为上架
    private Byte proPutaway = 1;
    /*所属图片*/
    private List<ProImg> proImgs;
    //meta标签相关内容
    private String proMetaKeyWord;

    private String proMetaDescription;

    private String proMetaTitle;

    private Map param=new HashMap();


}