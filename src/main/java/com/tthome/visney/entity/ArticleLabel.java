package com.tthome.visney.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author NBUG
 * @date 2018/5/11 16:45
 */
@Data
public class ArticleLabel implements Serializable {

    private static final long serialVersionUID = -8509942865048846893L;
    private Integer articleLabelId;
    private String articleLabelName;
    private Integer articleId;
}
