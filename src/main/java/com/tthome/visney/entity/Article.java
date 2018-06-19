package com.tthome.visney.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author NBUG
 * @date 2018/5/11 16:28
 */
@Data
public class Article implements Serializable {

    private static final long serialVersionUID = 4422655107817079979L;

    private Integer articleId;
    //文章标题
    private String articleName;
    //正文
    private String articleText;
    //编辑人
    private ArticleEditor articleEditor;
    //所属类别
    private ArticleCategory articleCategory;
    //浏览数
    private PageViews pageViews;
    //添加时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date articleAddTime;
    //更新时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date articleUpdateTime;
    //封面图片
    private ArticleImg articleImg;
    //是否首页推荐
    private Byte articleRecommend;
    //文章标签
    private List<ArticleLabel> labelList;

    private String articleMetaDescription;

    private String articleMetaTitle;

    private String articleKeyWord;


}
