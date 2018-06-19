package com.tthome.visney.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author NBUG
 * @date 2018/5/23 11:28
 */
@Data
public class ArticleImg implements Serializable {
    private Integer articleImgId;
    private String articleImgAlt;
    private String articleImgSrc;
}
