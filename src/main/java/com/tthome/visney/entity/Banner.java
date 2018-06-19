package com.tthome.visney.entity;

import lombok.Data;

import java.io.Serializable;
@Data
public class Banner implements Serializable {

    private static final long serialVersionUID = -1989775967731627534L;
    private Integer bannerId;

    private String bannerAlt;

    private String bannerSrc;

    private String bannerTypeId;

}