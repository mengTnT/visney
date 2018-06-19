package com.tthome.visney.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author NBUG
 * @date 2018/5/14 14:19
 */
@Data
public class ArticleRecomend implements Serializable {

    private static final long serialVersionUID = -6936554807870112954L;
    private Integer articleId;
    private String ArticleName;
    //更新时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date articleAddTime;
    private int articleCategoryId;
}
