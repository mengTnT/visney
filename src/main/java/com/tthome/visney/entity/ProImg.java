package com.tthome.visney.entity;

import lombok.Data;

import java.io.Serializable;

/**用于网页优化，图片 alt内容的填充
 * @author NBUG
 * @date 2018/5/22 14:13
 */
@Data
public class ProImg implements Serializable {

    private static final long serialVersionUID = 7067971342891438657L;

    private Integer proImgId;

    private String proImgAlt;

    private String proImgSrc;

    private int proImgCover;

}
