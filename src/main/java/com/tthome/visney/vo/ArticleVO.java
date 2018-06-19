package com.tthome.visney.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.tthome.visney.entity.ArticleImg;
import com.tthome.visney.entity.ArticleLabel;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 用于主页展示推荐文章
 *
 * @author NBUG
 * @date 2018/5/14 9:30
 */
@Data
public class ArticleVO implements Serializable {

    private static final long serialVersionUID = -8204292858038370351L;

    private Integer articleId;
    //文章标题
    private String articleName;
    //正文
    private String articleText;
    //封面图片
    private ArticleImg articleImg;
    //添加时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date articleAddTime;
    //更新时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date articleUpdateTime;
    //类别名称
    private String articleCategoryName;
    //文章标签
    private List<ArticleLabel> labelList;

    private int articleCategoryId;

}
